package pl.sdacademy.mocking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.mocking.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
