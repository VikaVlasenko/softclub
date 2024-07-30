package com.softclub.vvv.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;


//@Table(name="Users")

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String login,passw;
    
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
    private Date dateLast;
    
}
