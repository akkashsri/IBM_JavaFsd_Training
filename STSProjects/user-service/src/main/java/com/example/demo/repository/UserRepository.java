package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

public 	UserEntity findByUserId(String id);

public UserEntity findByEmail(String email);


}
