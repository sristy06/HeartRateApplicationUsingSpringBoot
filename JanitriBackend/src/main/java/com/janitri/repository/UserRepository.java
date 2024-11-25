package com.janitri.repository;

import com.janitri.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Custom query method to find a user by email and password
    Optional<User> findByEmailAndPassword(String email, String password);

	Object findByEmail(String email);
}
