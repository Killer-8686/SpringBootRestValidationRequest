package ru.masta.requestvalidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.masta.requestvalidation.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {


    User findByUserId(int id);
}
