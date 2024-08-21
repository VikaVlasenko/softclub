package com.softclub.vvv.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CompanyDto {
    private  Long id;
    private  int UNP;
    private String name;
    private Date dateFound;

}
