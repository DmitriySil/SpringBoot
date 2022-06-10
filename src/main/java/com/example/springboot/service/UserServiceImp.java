package com.example.springboot.service;

import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User user) {
        userRepository.save(user);
    }
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
    public List<User> listUsers() {
        return userRepository.findAll();
    }
    public User showUser(long id) {
        return userRepository.findById(id).orElse(null);
    }
    public void update(User user, long id) {
    }
}
