package com.onlinemart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	
	@Size(min = 3, max = 10, message = "Street no. should min of 3 and max of 10 Characters")
	private String streetNo;
	
	private String buildingName;
	
	@NotNull(message = "City cannot be null.")
	@NotBlank(message = "City cannot be blank.")
	@NotEmpty(message = "City cannot be empty.")
	private String city;
	
	@NotNull(message = "State cannot be null.")
	@NotBlank(message = "State cannot be blank.")
	@NotEmpty(message = "State cannot be empty.")
	private String state;
	
	@NotNull(message = "Country cannot be null.")
	@NotBlank(message = "Country cannot be blank.")
	@NotEmpty(message = "Country cannot be empty.")
	private String country;
	
	@Size(min = 6, max = 6, message = "Pincode should be of 6 digit only")
	private Integer pincode;

	
	
	public Address(
			@Size(min = 3, max = 10, message = "Street no. should min of 3 and max of 10 Characters") String streetNo,
			String buildingName,
			@NotNull(message = "City cannot be null.") @NotBlank(message = "City cannot be blank.") @NotEmpty(message = "City cannot be empty.") String city,
			@NotNull(message = "State cannot be null.") @NotBlank(message = "State cannot be blank.") @NotEmpty(message = "State cannot be empty.") String state,
			@NotNull(message = "Country cannot be null.") @NotBlank(message = "Country cannot be blank.") @NotEmpty(message = "Country cannot be empty.") String country,
			@Size(min = 6, max = 6, message = "Pincode should be of 6 digit only") Integer pincode) {
		super();
		this.streetNo = streetNo;
		this.buildingName = buildingName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}



	public Integer getAddressId() {
		return addressId;
	}



	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}



	public String getStreetNo() {
		return streetNo;
	}



	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}



	public String getBuildingName() {
		return buildingName;
	}



	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public Integer getPincode() {
		return pincode;
	}



	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}



	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", streetNo=" + streetNo + ", buildingName=" + buildingName
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}

	
	
	
	
	
}
