package com.softclub.vvv.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Empl  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     
     private String surname;
     private String name;
     private String work;
     private Date dOfB;
     @Size(min=14, max=14, message="Некорректный номер пасспорта")
     private String pasport;


     @ManyToOne
     @JoinColumn(name = "company_id")
     private Company company;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
    public Date getdOfB() {
        return dOfB;
    }
    public void setdOfB(Date dOfB) {
        this.dOfB = dOfB;
    }
    public String getPasport() {
        return pasport;
    }
    public void setPasport(String pasport) {
        this.pasport = pasport;
    }
    public Empl(String name, java.util.Date dateFound, String surname, String name2, String work, Date dOfB,
            @Size(min = 14, max = 14, message = "Некорректный номер пасспорта") String pasport) {
        //super(name, dateFound);
        this.surname = surname;
        name = name2;
        this.work = work;
        this.dOfB = dOfB;
        this.pasport = pasport;
    }

    
     


}
