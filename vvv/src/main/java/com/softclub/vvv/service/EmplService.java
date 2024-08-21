package com.softclub.vvv.service;

import com.softclub.vvv.dto.EmplDto;
import com.softclub.vvv.models.Company;
import com.softclub.vvv.models.Empl;

import com.softclub.vvv.repo.EmplRepository;
import com.softclub.vvv.utils.EmplMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Date;
//import java.sql.Date;

@Service
public class EmplService {

    @Autowired
    EmplRepository emplRepository;
    @Autowired
    EmplMapper emplMapper;
    @Autowired
    CompanyService companyService;

    //  Полный список сотрудников
    public List<EmplDto> readAll()
    {
        List<Empl> empl = (List<Empl>) emplRepository.findAll();
        return empl.stream()
                .map(emplMapper::mapToEmplDto)
                .collect(Collectors.toList());
    }


    // Получить список сотрудникво по UNP компании
    public List<EmplDto> readEplUnp(int UNP)
    {
        List<Empl> empl = (List<Empl>) emplRepository.findByUNP(UNP);

        return empl.stream()
                .map(emplMapper::mapToEmplDto)
                .collect(Collectors.toList());
    }


    public void addEmpl(String name,String surname,String work,int UNP,String dOfB) throws ParseException {

        DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
        Date dt = df.parse(dOfB);

        Company comp = companyService.getByUNP(UNP);

        Empl empl= new Empl();
        empl.setName(name);
        empl.setUNP(UNP);
        empl.setSurname(surname);
        empl.setDOfB(dt);
        empl.setCompany(comp);

        emplRepository.save(empl);

    }


}
