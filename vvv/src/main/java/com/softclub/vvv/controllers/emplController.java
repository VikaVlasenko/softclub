package com.softclub.vvv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.softclub.vvv.repo.emplRepository;

@Controller
public class emplController {

    @SuppressWarnings("unused")
    @Autowired
     private emplRepository empRepository;

    @GetMapping(value="/empl")
    public String empl(Model model) {
        model.addAttribute("title", "Главная страница");       
        return "empl";
    }


}
