package com.softclub.vvv.controllers;

import com.softclub.vvv.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {


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
   

}