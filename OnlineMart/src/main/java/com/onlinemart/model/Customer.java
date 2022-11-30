package com.onlinemart.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	
	@Size(min = 3, max = 15, message = "First Name should be min 3 and max 15 Characters!")
	private String firstName;
	
	@Size(min = 1, max = 15, message = "Last Name should be min 1 and max 15 Characters!")
	private String lastName;
	
	@Size(min = 10, max = 10, message = "Mobile Number should contain 10 digit only!")
	private String mobileNumber;
	
	//@Pattern(regexp = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[&!@#%$]){8,16}$", message = "Password must contain atleast 1 uppercase, 1 lowercase, 1 special character from[&!@#%^$] and 1 digit")
	@Size(min = 8, max = 16, message = "Password must contain min 8 and max 16 digits!")
	private String password;
	
	@Email(message = "Please enter a valid email...")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "c_address", joinColumns = @JoinColumn(name="customer_id", referencedColumnName = "customerId"))
	private Address address;

	public Customer(
			@Size(min = 3, max = 15, message = "First Name should be min 3 and max 15 Characters!") String firstName,
			@Size(min = 1, max = 15, message = "Last Name should be min 1 and max 15 Characters!") String lastName,
			@Min(value = 10, message = "Mobile Number should contain 10 digit only!") @Max(value = 10, message = "Mobile Number should contain 10 digit only!") String mobileNumber,
			@Pattern(regexp = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[&!@#%$^]){8,16}$", message = "Password must contain atleast 1 uppercase, 1 lowercase, 1 special character from[&!@#%^$] and 1 digit") @Size(min = 8, max = 16, message = "Password must contain min 8 and max 16 digits!") String password,
			@Email(message = "Please enter a valid email...") String email, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.email = email;
		this.address = address;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", password=" + password + ", email=" + email + ", address="
				+ address + "]";
	}
	
	
	
	
	

	

	
}
