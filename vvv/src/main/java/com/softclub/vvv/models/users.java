package com.softclub.vvv.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;


//@Table(name="users")
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Size(min = 1, max = 1024, message = "Логин должен быть от 1 до 16 символов")
    private String login;
    private String passw;
    private Date dateLast;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassw(String passw) {
        this.passw = passw;
    }
    public void setDateLast(Date dateLast) {
        this.dateLast = dateLast;
    }
    public String getLogin() {
        return login;
    }
    public String getPassw() {
        return passw;
    }
    public Date getDateLast() {
        return dateLast;
    }
    
}
