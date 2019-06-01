package pl.sdacademy.mocking.services;

import org.springframework.stereotype.Service;
import pl.sdacademy.mocking.domain.Car;
import pl.sdacademy.mocking.repositories.CarRepository;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car rentCarById(Long id) {
        //renting logic
        return carRepository.findById(id).orElse(null);
    }

    public Car addCar(Car car) {
        //adding logic
        carRepository.save(car);
        return carRepository.save(car);
    }

    public void deleteCar(Car car) {
        //deleting logic
        carRepository.delete(car);
    }
}
