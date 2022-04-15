package com.spring.bean_validation.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UpdatePasswordDTO {
	@NotBlank
	@Size(min=2, max=250, message = "password must be withing 2 to 250 characters")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
