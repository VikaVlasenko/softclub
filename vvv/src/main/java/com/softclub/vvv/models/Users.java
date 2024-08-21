package com.softclub.vvv.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Data;



@Data//@Table(name="users")
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Size(min = 1, max = 16, message = "Логин должен быть от 1 до 16 символов")
    private String login;
    @Size(min = 1, max = 16, message = "Пароль должен быть от 1 до 16 символов")
    private String passw;
    private Date dateLast;
    
}
