package com.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.dtos.CarDto;
import com.springboot.dtos.DriverDto;
import com.springboot.entites.CarEntity;
import com.springboot.entites.DriverEntity;
import com.springboot.repositories.CarRepository;
import com.springboot.repositories.DriverRepository;

@Service
public class DriverService {

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private DriverRepository driverRepository;
	
	
	

	public void saveDriver(DriverDto driverDto) {

		DriverEntity driver = null;
		if (driverDto != null) {
			driver = new DriverEntity();
		}

		driver.setFirstName(driverDto.getFirstName());
		driver.setLastName(driverDto.getLastName());
		driver.setEmail(driverDto.getEmail());

		CarEntity car = convertCar(driverDto.getCarDto());
		driver.setCar(car);
		
		driverRepository.save(driver);
	}

	public CarEntity convertCar(CarDto carDto) {

		CarEntity car = new CarEntity();

		car.setMake(carDto.getMake());
		car.setModel(carDto.getModel());
		car.setYear(carDto.getYear());

		return car;

	}


}
