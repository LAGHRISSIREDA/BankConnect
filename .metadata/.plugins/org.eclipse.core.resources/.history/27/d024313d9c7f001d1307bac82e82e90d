package com.codesigne.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codesigne.entities.UserEntity;
import com.codesigne.repositories.UserRepository;
import com.codesigne.services.UserService;
import com.codesigne.shared.Utils;
import com.codesigne.shared.dto.UserDto;




@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	//@Autowired
	//BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	Utils util;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		
		UserEntity checkUser = userRepository.findByEmail(userDto.getEmail());
		
		//check if user Email already exist in data
		if(checkUser != null) throw new RuntimeException("User Already Exists!");
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);
		
		//bCryptPasswordEncoder.encode(userDto.getPassword())
		userEntity.setEncryptedPassword("testtest");
		userEntity.setUserId(util.generateUserId(32));
		UserEntity newUser = userRepository.save(userEntity);
		
		UserDto user = new UserDto();
		BeanUtils.copyProperties(newUser, user);
		return user;
	}

}
