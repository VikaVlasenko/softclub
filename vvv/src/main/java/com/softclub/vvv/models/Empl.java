package com.softclub.vvv.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Empl  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private String surname;
     private String name;
     private String work;
     private Date   dOfB;
     @Size(min=14, max=14, message="Некорректный номер пасспорта")
     private String pasport;
     private int   UNP;


     @ManyToOne
     @JoinColumn(name = "company_id")        // id   компании
     private Company company;

}
