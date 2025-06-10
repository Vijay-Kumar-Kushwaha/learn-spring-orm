package com.lcwd.orm.services;

import com.lcwd.orm.entities.User;
import com.lcwd.orm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {


    User saveUser(User user);
    User updateUser(User user, int userId);
    void deleteUser(int userId);
    List<User> getAllUsers();
    User getUser(int userId);
}
