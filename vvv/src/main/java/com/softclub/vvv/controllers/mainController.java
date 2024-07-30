package com.softclub.vvv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class mainController {

    // @Autowired
    // private UserService userService;

    @GetMapping(value="/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");       
        return "home";
    }


    @GetMapping(value="/about")
    public String about(Model model) {
        model.addAttribute("title", "О программе");       
        return "about";
    }

        
    @GetMapping(value="/add_user")
    public String adduser(Model model) {
        model.addAttribute("title", "Главная страница");       
        return "users/addUser";
    }
    
        
   

}