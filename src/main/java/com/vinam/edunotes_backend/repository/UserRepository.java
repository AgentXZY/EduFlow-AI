package com.vinam.edunotes_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinam.edunotes_backend.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
