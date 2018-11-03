/**
 * 
 */
package com.carmanagementApp.carstore.entity.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.carmanagementApp.carstore.entity.Car;
import com.carmanagementApp.carstore.entity.service.CarService;
import com.carmanagementApp.carstore.repository.CarRepository;

/**
 * @author Hany.Abdelbaqy
 *
 */
@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	private CarRepository carRepository;
	
	public void setCarRepository(CarRepository carRepository) {
		this.carRepository = carRepository;
	}
	
	@Override
	public List<Car> retrieveCars() {
		return carRepository.findAll();
	}

	@Override
	public Car getCar(Long carId) {
		Optional<Car> optCar = carRepository.findById(carId);
		return optCar.get();
	}

	@Override
	public void saveCar(Car car) {
		carRepository.save(car);
	}

	@Override
	public void deleteCar(Long carId) {
		carRepository.deleteById(carId);
	}

	@Override
	public void updateCar(Car car) {
		carRepository.save(car);
	}

}
