/**
 * 
 */
package com.carmanagementApp.carstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carmanagementApp.carstore.entity.Car;
import org.springframework.stereotype.Repository;

/**
 * @author Hany.Abdelbaqy
 *
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}
