package com.softclub.vvv.controllers;

import com.softclub.vvv.dto.EmplDto;
import com.softclub.vvv.dto.UsersDto;
import com.softclub.vvv.service.EmplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.softclub.vvv.repo.EmplRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.util.Date;

@Controller
public class EmplController {

    @SuppressWarnings("unused")
    @Autowired
     private EmplRepository empRepository;
    @Autowired
    private EmplService emplService;

    //  Общий список сотрудников
    @GetMapping(value="/listEmpl")
    public String listEmpl(Model model) {

        Iterable<EmplDto> emplDto = emplService.readAll();
        model.addAttribute("Empl", emplDto);

        return "empl/listEmpl";
    }

    @GetMapping(value="/{UNP}/listEmplComp")
    public String listEmplComp(@PathVariable(value="UNP") int UNP,Model model) {

        Iterable<EmplDto> emplDto = emplService.readEplUnp(UNP);

        model.addAttribute("Empl", emplDto);

        return "empl/listEmpl";
    }


    @GetMapping(value="/{id}/{UNP}/addEmpl")
    public String addEmpl(@PathVariable(value="id") long id,@PathVariable(value="UNP") int UNP,Model model) {

        model.addAttribute("unpin", UNP);
        model.addAttribute("compId", id);

        return "empl/addEmpl";
    }


    @PostMapping(value="/addEmplForm")
    public String addEmplForm(@RequestParam String name, @RequestParam String surname, @RequestParam String work, @RequestParam String dOfB,
                              @RequestParam String unpcomp, Model model) throws ParseException {

        int unp=Integer.parseInt(unpcomp);

        emplService.addEmpl(name,surname,work,unp,dOfB);
        return "redirect:/";
    }


}
