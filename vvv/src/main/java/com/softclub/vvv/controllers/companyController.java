package com.softclub.vvv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.softclub.vvv.repo.companyRepository;

@Controller
public class companyController {
    
    @SuppressWarnings("unused")
    @Autowired
     private companyRepository companyRepository;

    @GetMapping(value="/comp")

    public String comp(Model model) {
        model.addAttribute("title", "Главная страница");       
        return "comp";
    }


}
