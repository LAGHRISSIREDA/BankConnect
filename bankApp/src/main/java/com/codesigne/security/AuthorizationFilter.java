package com.codesigne.security;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import io.jsonwebtoken.Jwts;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AuthorizationFilter extends BasicAuthenticationFilter {

	public AuthorizationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String header = request.getHeader(SecurityConstants.HEADER_STRING);
		
		if(header == null || !header.startsWith(SecurityConstants.TOKEN_PREFIX)) {
			chain.doFilter(request, response);
			return;
		}
		UsernamePasswordAuthenticationToken authentication = getAuthentication(request);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		chain.doFilter(request, response);
	}
	
	
	private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
		String token = request.getHeader(SecurityConstants.HEADER_STRING);
		if(token != null) {
			token = token.replace(SecurityConstants.HEADER_STRING, "");
			String user = Jwts.parser()
					.setSigningKey(SecurityConstants.TOKEN_SECRET)
					.parseClaimsJws(token)
					.getBody()
					.getSubject();
			if(user != null) {
				return new UsernamePasswordAuthenticationToken(user, null,new ArrayList<>());
			}
			return null;
		}
		return null;
	}
	
	

}
