package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dtos.DriverDto;
import com.springboot.services.DriverService;

@RestController
@RequestMapping("/driver")
public class DriverController {

	@Autowired
	private DriverService driverService;
	
	@RequestMapping(value = "/{firstName}",method = RequestMethod.GET)
	public DriverDto getDriver(@PathVariable String firstName) {
		
		return driverService.getDriver(firstName);
	}
	
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void saveDriver(@RequestBody DriverDto dto) {
		
		driverService.saveDriver(dto);
	}
	
	
	@RequestMapping(value = "get",method =RequestMethod.GET)
	
	public List<DriverDto> getAll() {
		
		return driverService.getAll();
	}
	
	
}