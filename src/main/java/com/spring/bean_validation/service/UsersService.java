package com.spring.bean_validation.service;

import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.bean_validation.model.UpdatePasswordDTO;
import com.spring.bean_validation.model.Users;
import com.spring.bean_validation.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;
	
	public ResponseEntity<?>createUser(Users user){
		final Users savedUser = usersRepository.save(user);
		user.setPassword("123456");
		System.out.println(savedUser.toString());
		return ResponseEntity.ok().body(savedUser);
	}
	
	public ResponseEntity<?>updatePassword(Long userId, UpdatePasswordDTO passwordDTO){
		Optional<Users> userOpt = usersRepository.findById(userId);
		if(userOpt.isPresent()) {
			Users user= userOpt.get();
			user.setPassword(passwordDTO.getPassword());
			usersRepository.save(user);
			return ResponseEntity.ok().body("Password Updated Successfully");
		}
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found with Id :"+userId);		
	}

}
