package com.softclub.vvv.dto;

import jakarta.validation.constraints.Size;

import java.util.Date;
import lombok.*;


@Data
public class UsersDto {
    private Long   id;
    private String login;
    private String passw;
    private Date   dateLast;
}
