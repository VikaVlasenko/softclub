package com.softclub.vvv.controllers;


import com.softclub.vvv.dto.UsersDto;
import com.softclub.vvv.models.Users;
import com.softclub.vvv.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.softclub.vvv.repo.UsersRepository;



@Controller
public class UsersController {
    
    @Autowired
    private UsersService usersService;

    @PostMapping(value="/check_login")
    public String checkLogin(@RequestParam String login,@RequestParam String password, Model model) {

        Users users=usersService.getByLogin(login);
        if(users == null)
            return "redirect:/";

        if(users.getPassw().equals(password)) {
            return "home";
        }
        else {
            return "redirect:/";
        }
    }


    // Вывод на экран всех пользователей
    @GetMapping(value="/list_user")
    public String listUser(Model model) {
       Iterable<UsersDto> usersDto = usersService.readAll();
       model.addAttribute("Users", usersDto);
       return "users/listUser";
    }


    //  Вызов формы для ввода пользователя
    @GetMapping(value="/add_user")
    public String adduser(Model model) {
        model.addAttribute("title", "Добавить пользователя");
        return "users/addUser";
    }

    //  Обработка формы ввода пользователя
    @PostMapping(value="/add_user")
    public String addUser(@RequestParam String login,@RequestParam String password, Model model)
    {
        usersService.addUser(login,password);
        return "redirect:/";
    }

    //  Удаление пользователя
    @GetMapping(value="/{id}/remove")
    public String RemoveUser(@PathVariable(value="id") long id, Model model ) {

      usersService.deleteId(id);
      return "redirect:/";
    }
    

}
