package com.softclub.vvv.service;



import com.softclub.vvv.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(User user) {
        // Логика сохранения пользователя в базу данных
        System.out.println("Saving user: " + user.getUsername());
    }
}