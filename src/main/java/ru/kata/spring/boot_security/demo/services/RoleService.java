package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    List<Role> getAllRoles();

    void addRole(Role role);

    Role findById(int id);

    Set<Role> findByIdRoles(List<Long> roles);
}
