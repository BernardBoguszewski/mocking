package pl.sdacademy.mocking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sdacademy.mocking.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
