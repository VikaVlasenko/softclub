package com.softclub.vvv.service;

import com.softclub.vvv.dto.CompanyDto;
import com.softclub.vvv.models.Company;
import com.softclub.vvv.models.Users;
import com.softclub.vvv.repo.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.softclub.vvv.utils.CompanyMapper;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyMapper companyMapper;

    public List<CompanyDto> readAll()
    {
        List<Company> company = (List<Company>) companyRepository.findAll();
        return company.stream()
                .map(companyMapper::mapToCompanyDto)
                .collect(Collectors.toList());
    }


    public void addCompany(String UNP, String name, String dateFound) throws ParseException {

        DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
        Date dt = df.parse(dateFound);

        Company comp= new Company();
        comp.setName(name);
        int id=Integer.parseInt(UNP);
        comp.setUNP(id);
        comp.setDateFound(dt);

        companyRepository.save(comp);

    }

    // Удаление компании по ID
    public void deleteId(long Id)
    {
        Company comp=companyRepository.findById(Id).orElseThrow();
        companyRepository.delete(comp);
    }

    public Company getByUNP(int UNP)
    {
        Company comp=companyRepository.findByUNP(UNP);
        return comp;

    }



}
