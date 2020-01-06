package com.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entites.CarEntity;

@Repository
public interface CarRepository extends CrudRepository<CarEntity, Integer>{

}
