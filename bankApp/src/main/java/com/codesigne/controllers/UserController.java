package com.codesigne.controllers;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codesigne.requests.UserRequest;
import com.codesigne.responses.UserResponse;
import com.codesigne.services.UserService;
import com.codesigne.shared.dto.UserDto;




@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public ResponseEntity<String> getUser() {
		System.out.println("inside get users");
		return ResponseEntity.ok("hello from get");
	}
	
	@PostMapping
	public UserResponse createUser(@RequestBody UserRequest userRequest) {
		
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRequest, userDto);
		
		UserDto createUser = userService.createUser(userDto);
		
		UserResponse userResponse = new UserResponse();
		
		BeanUtils.copyProperties(createUser, userResponse);
		return userResponse;
		
	}
	
	@PutMapping
	public String updateUser() {
		return "hello from update method";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "Hello from delete method";
	}

}
