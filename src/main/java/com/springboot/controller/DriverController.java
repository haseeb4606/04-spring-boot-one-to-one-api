package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	private DriverService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void saveDriver(@RequestBody DriverDto dto) {
		
		service.saveDriver(dto);
	}
}
