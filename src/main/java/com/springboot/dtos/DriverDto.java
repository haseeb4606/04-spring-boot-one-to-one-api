package com.springboot.dtos;

public class DriverDto {

	private Integer Id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private CarDto carDto;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CarDto getCarDto() {
		return carDto;
	}

	public void setCarDto(CarDto carDto) {
		this.carDto = carDto;
	}
	
	
}
