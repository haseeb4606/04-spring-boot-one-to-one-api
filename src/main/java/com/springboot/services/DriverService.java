package com.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dtos.CarDto;
import com.springboot.dtos.DriverDto;
import com.springboot.entites.CarEntity;
import com.springboot.entites.DriverEntity;
import com.springboot.repositories.DriverRepository;

@Service
public class DriverService {

	@Autowired
	private DriverRepository driverRepository;

	public void saveDriver(DriverDto driverDto) {

		DriverEntity driver = null;
		if (driverDto != null) {
			driver = new DriverEntity();
		}

		driver.setId(driverDto.getId());
		driver.setFirstName(driverDto.getFirstName());
		driver.setLastName(driverDto.getLastName());
		driver.setEmail(driverDto.getEmail());

		CarEntity car = convertCar(driverDto.getCarDto());
		driver.setCar(car);

		driverRepository.save(driver);
	}

	public CarEntity convertCar(CarDto carDto) {

		CarEntity car = new CarEntity();

		car.setId(carDto.getId());
		car.setMake(carDto.getMake());
		car.setModel(carDto.getModel());
		car.setYear(carDto.getYear());

		return car;

	}

	//fetching one driver 
	public DriverDto getDriver(String firstName) {

		DriverEntity driver = driverRepository.findByFirstName(firstName);

		DriverDto dr = convertDriver(driver);

		return dr;
			
			
		}

	//fetching all drivers 
	public List<DriverDto> getAll(){
		
		List<DriverEntity> driver = driverRepository.findAll();
		
		List<DriverDto> drdto = new ArrayList<DriverDto>();
		
		for(DriverEntity de:driver) {
			
			DriverDto dto = convertDriver(de);
			
			drdto.add(dto);
			
		}
		
		return drdto;
	}
	

	public DriverDto convertDriver(DriverEntity entity) {

		DriverDto dto = null;

		if (entity != null) {

			dto = new DriverDto();

			dto.setFirstName(entity.getFirstName());
			dto.setLastName(entity.getLastName());
			dto.setEmail(entity.getEmail());

			CarDto car = new CarDto();
			
			car.setMake(entity.getCar().getMake());
			car.setModel(entity.getCar().getModel());
			car.setYear(entity.getCar().getYear());
			
			dto.setCarDto(car);
			
		}

		return dto;
	}
	
	

}
