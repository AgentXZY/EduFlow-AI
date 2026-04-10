package com.vinam.edunotes_backend.service;

import com.vinam.edunotes_backend.User;
import com.vinam.edunotes_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public User saveUser(User u){
        return userRepo.save(u);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public Optional<User> getUserById(Integer id) { //OPTIONAL: a container object that may or may not contain a non-null value
        return userRepo.findById(id);
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }
	
}
