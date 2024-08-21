package com.softclub.vvv.utils;

import com.softclub.vvv.dto.EmplDto;
import com.softclub.vvv.models.Empl;
import org.springframework.stereotype.Service;

@Service
public class EmplMapper {

    public EmplDto mapToEmplDto(Empl empl) {
        EmplDto dto = new EmplDto();

        dto.setId(empl.getId());
        dto.setWork(empl.getWork());
        dto.setPasport(empl.getPasport());
        dto.setName(empl.getName());
        dto.setSurname(empl.getSurname());
        dto.setDOfB(empl.getDOfB());
        dto.setUNP(empl.getUNP());
        return dto;
    }

    public Empl mapToEmpl(EmplDto dto)
    {
        Empl empl = new Empl();
        empl.setId(dto.getId());
        empl.setPasport(dto.getPasport());
        empl.setSurname(dto.getSurname());
        empl.setName(dto.getName());
        empl.setWork(dto.getWork());
        empl.setDOfB(dto.getDOfB());
        empl.setUNP(dto.getUNP());
        //empl.setCompany();
        return empl;
    }

}