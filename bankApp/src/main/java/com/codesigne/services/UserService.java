package com.codesigne.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.codesigne.shared.dto.UserDto;

public interface UserService extends UserDetailsService{

	UserDto createUser(UserDto userDto);
	UserDto getUser(String email);
	UserDto getUserByUserId(String userId);
	UserDto updateUser(String id,UserDto userDto);
	void deleteUser(String userId);
	List<UserDto> getUsers(int page,int limit);
}
