package com.onlinemart.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@NotNull(message = "User Id can't be null...")
	@NotBlank(message = "User Id cannot be blank.")
	@NotEmpty(message = "User Id cannot be empty.")
	private String userId;
	
	//@Pattern(regexp = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[&!@#%$^]){8,16}$", message = "Password must contain atleast 1 uppercase, 1 lowercase, 1 special character from[&!@#%^$] and 1 digit")
	private String password;
	
	@NotNull(message = "Please, Enter your role!")
	@NotBlank(message = "Please, Enter your role!")
	@NotEmpty(message = "Please, Enter your role!")
	private String role;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(
			@NotNull(message = "User Id can't be null...") @NotBlank(message = "User Id cannot be blank.") @NotEmpty(message = "User Id cannot be empty.") String userId,
			String password,
			@NotNull(message = "Please, Enter your role!") @NotBlank(message = "Please, Enter your role!") @NotEmpty(message = "Please, Enter your role!") String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + role + "]";
	}
	
}
