/**
 * 
 */
package com.carmanagementApp.carstore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carmanagementApp.carstore.entity.Car;
import com.carmanagementApp.carstore.entity.service.CarService;

/**
 * @author Hany.Abdelbaqy
 *
 */
@RestController
public class CarController {
	@Autowired
	private CarService carService;
	
	public void setCarService(CarService carService) {
		this.carService = carService;
	}

	@GetMapping("/evolvice/cars")
	public List<Car> getCars() {
		List<Car> cars = carService.retrieveCars();
		return cars;
	}

	@GetMapping("/evolvice/cars/{carId}")
	public Car getCar( @PathVariable(name = "carId") Long carId) {
		return carService.getCar(carId);
	}

	@PostMapping("/evolvice/cars")
	public void saveCar(Car car) {
		carService.saveCar(car);
		System.out.println("Car Saved Successfully");
	}

	@DeleteMapping("/evolvice/cars/{carId}")
	public void deleteCar( @PathVariable(name = "carId") Long carId) {
		carService.deleteCar(carId);
		System.out.println("Car Deleted Successfully");
	}

	@PutMapping("/evolvice/cars/{carId}")
	public void updateCar(@RequestBody Car car, @PathVariable(name = "carId") Long carId) {
		Car carDB = carService.getCar(carId);
		if (carDB != null) {
			carService.updateCar(car);
			System.out.println("Car Updated Successfully");
		}
	}
}
