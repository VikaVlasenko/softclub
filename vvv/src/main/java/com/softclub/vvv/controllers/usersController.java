package com.softclub.vvv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    @PostMapping(value="/add_user")
    public String addUserButton(@RequestParam String login,@RequestParam String password, Model model) {
        Users us= new Users(login, password);
        usersRepository.save(us);
        return "redirect:/";
    }

    @GetMapping(value="/{id}/remove")
    public String RemoveUser(@PathVariable(value="id") long id, Model model ) {

    Users user=usersRepository.findById(id).orElseThrow();
    usersRepository.delete(user);
        return "redirect:/";
    }
    

}
