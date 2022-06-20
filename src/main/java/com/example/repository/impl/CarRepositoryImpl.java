package com.example.repository.impl;

import com.example.entity.Car;
import com.example.repository.CarRepository;

public class CarRepositoryImpl {
    private CarRepository carRepository;
    private Car car = new Car();

    public void createCar(Car car){
        carRepository.save(car);
    }
}
