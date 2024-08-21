package com.softclub.vvv.utils;

import com.softclub.vvv.dto.CompanyDto;
import com.softclub.vvv.models.Company;
import org.springframework.stereotype.Service;

@Service
public class CompanyMapper {

    public CompanyDto mapToCompanyDto(Company company)
    {
        CompanyDto dto = new CompanyDto();
        dto.setId(company.getId());
        dto.setUNP(company.getUNP());
        dto.setName(company.getName());
        dto.setDateFound(company.getDateFound());
        return dto;
    }

    public Company mapToUsers(CompanyDto dto)
    {
        Company company=new Company();
        company.setId(dto.getId());
        company.setUNP(dto.getUNP());
        company.setName(dto.getName());
        company.setDateFound(dto.getDateFound());

        return company;
    }


}
