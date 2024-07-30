package com.softclub.vvv.service;



import org.springframework.stereotype.Service;

import com.softclub.vvv.models.User;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(User user) {
        // Логика сохранения пользователя в базу данных
        System.out.println("Saving user: " + user.getUsername());
    }
}