package com.codesigne.shared;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;


@Component
public class Utils {
	
	private final Random RANDOM = new SecureRandom();
	private final String ALPHANUMERIC = "azertyuiopmlkjhgfdsqwxcvbnAZERTYUIOPMLKJHGFDSQWXCVBN0987654321";
	
	public String generateUserId(int length) {
		StringBuilder returnValue = new StringBuilder(length);
		for(int i = 0 ; i < length ; i++) {
			returnValue.append(ALPHANUMERIC.charAt(RANDOM.nextInt(ALPHANUMERIC.length())));
		}
		return new String(returnValue);
	}

}
