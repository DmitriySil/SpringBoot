package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
     void save(User user);
     void delete(Long id);
     List<User> listUsers();
     User showUser(long id);
     void update(User user, long id);
}
