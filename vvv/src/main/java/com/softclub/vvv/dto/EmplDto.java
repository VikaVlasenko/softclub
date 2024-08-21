package com.softclub.vvv.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EmplDto {
    private Long   id;
    private String surname;
    private String name;
    private String work;
    private Date   dOfB;
    private String pasport;
    private int    UNP;             // UNP компании
}
