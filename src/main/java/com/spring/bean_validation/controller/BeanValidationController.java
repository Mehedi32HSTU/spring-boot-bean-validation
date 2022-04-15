package com.spring.bean_validation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bean_validation.model.UpdatePasswordDTO;
import com.spring.bean_validation.model.Users;
import com.spring.bean_validation.service.UsersService;

@RestController
@RequestMapping("bean-validation")
public class BeanValidationController {
	@Autowired
	private UsersService usersService;

	@RequestMapping(value = "/create-user", method = RequestMethod.POST)
	public ResponseEntity<?>createUser(@Valid @RequestBody Users user){
		return usersService.createUser(user);
	}
	@RequestMapping(value = "/user/{id}/update-password", method = RequestMethod.PUT)
	public ResponseEntity<?>updatePassword(@PathVariable ("id") Long userId,@Valid @RequestBody UpdatePasswordDTO password){
		return usersService.updatePassword(userId,password);
	}
	
}
