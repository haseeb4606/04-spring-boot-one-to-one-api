package com.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entites.DriverEntity;

@Repository
public interface DriverRepository extends CrudRepository<DriverEntity, Integer> {

	
	
}
