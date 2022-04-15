package com.spring.bean_validation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="user_table")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	@Column(name = "first_name")
	@NotBlank
	@Size(min=2, max=50, message = "User first name should have minimum 2 and maximum 50 characters")
	private String firstName;

	@Column(name = "last_name")
	@NotBlank
	@Size(min=2, max=50, message = "User last name should have minimum 2 and maximum 50 characters")
	private String lastName;

	@Column(name = "user_name")
	@NotBlank
	@Size(min=2, max=50, message = "user name should have minimum 2 and maximum 50 characters")
	private String userName;

	@Column(name = "email")
	@NotBlank
	@Email
	@Size(min=5, max=100, message = "email should have minimum 5 and maximum 100 characters")
	private String email;

	@Column(name = "password")
	@JsonIgnore
	private String password;

	public Users() {
		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", email=" + email + "]";
	}

}
