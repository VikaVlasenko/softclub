package com.softclub.vvv.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String login,passw;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
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
