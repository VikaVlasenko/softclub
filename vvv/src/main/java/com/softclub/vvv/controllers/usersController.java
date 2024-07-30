package com.softclub.vvv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.softclub.vvv.models.Users;
import com.softclub.vvv.repo.usersRepository;

@Controller
public class usersController {
    
     @Autowired
     private usersRepository usersRepository;


    @GetMapping(value="/add_user")
    public String adduser(Model model) {
        model.addAttribute("title", "Главная страница");       
        return "users/addUser";
    }

    @GetMapping(value="/list_user")
    public String listuser(Model model) {
        
       Iterable<Users> users =usersRepository.findAll();

       model.addAttribute("Users", users);
       return "users/listUser";
    }



}
