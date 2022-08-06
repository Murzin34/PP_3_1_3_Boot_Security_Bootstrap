package ru.kata.spring.boot_security.demo.dao;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    User getUserById(int id);

    User getUserByUsername(String username);

    void saveUser(User user);

    void updateUser(User updateUser);

    void removeUserById(int id);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
