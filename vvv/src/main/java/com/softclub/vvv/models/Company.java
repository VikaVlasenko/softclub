package com.softclub.vvv.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Company {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private  int UNP; 
    private String name;
    private Date dateFound;
    public int getCompId() {
        return UNP;
    }
    public void setCompId(int UNP) {
        this.UNP = UNP;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDateFound() {
        return dateFound;
    }
    public void setDateFound(Date dateFound) {
        this.dateFound = dateFound;
    }
    public Company() {
    }
    public Company(String name, Date dateFound) {
        this.name = name;
        this.dateFound = dateFound;
    }
    
}
