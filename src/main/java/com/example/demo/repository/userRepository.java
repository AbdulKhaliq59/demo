package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.user;
public interface userRepository extends CrudRepository<user, Integer> {
    
}
