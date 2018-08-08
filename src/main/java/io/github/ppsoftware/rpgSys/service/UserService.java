package io.github.ppsoftware.rpgSys.service;


import org.springframework.stereotype.Service;

import io.github.ppsoftware.rpgSys.model.UserDao;

@Service
public interface UserService {
    void save(UserDao user);

    UserDao findByUsername(String username);
}