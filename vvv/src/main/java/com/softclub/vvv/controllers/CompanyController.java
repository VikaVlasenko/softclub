package com.softclub.vvv.controllers;

import com.softclub.vvv.dto.CompanyDto;
import com.softclub.vvv.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.softclub.vvv.repo.CompanyRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;

@Controller
public class CompanyController {
    
    @SuppressWarnings("unused")
    @Autowired
     private CompanyRepository companyRepository;
    @Autowired
    private CompanyService companyService;

    @GetMapping(value="/listCompany")
    public String listUser(Model model) {
        Iterable<CompanyDto> compDto = companyService.readAll();
        model.addAttribute("Company", compDto);
        return "company/listCompany";
    }

    // Запуск формы добавления компании
    @GetMapping(value="/addCompany")
    public String addCompanyForms(Model model) {
        model.addAttribute("title", "Главная страница");
        return "company/addCompany";
    }

// --  Добавить компанию  в таблицу через сервис
    @PostMapping(value="/addCompany")
    public String addCompany(@RequestParam String comp_name, @RequestParam String comp_unp,@RequestParam String comp_dateFound, Model model) throws ParseException {

        companyService.addCompany(comp_unp, comp_name, comp_dateFound);

        return "redirect:/";
    }

    @GetMapping(value="/{id}/removeCompany")
    public String removeCompany(@PathVariable(value="id") long id, Model model ) {
        companyService.deleteId(id);
        return "redirect:/";
    }


}
