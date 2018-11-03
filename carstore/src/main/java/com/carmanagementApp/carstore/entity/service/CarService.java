package com.carmanagementApp.carstore.entity.service;
import java.util.List;
import com.carmanagementApp.carstore.entity.Car;

/**
 * @author Hany.Abdelbaqy
 *
 */
public interface CarService {
    public List<Car> retrieveCars();
    public Car getCar(Long carId);
    public void saveCar(Car car);
    public void deleteCar(Long carId);
    public void updateCar(Car car);
}
