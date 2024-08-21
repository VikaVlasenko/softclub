package com.softclub.vvv.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softclub.vvv.models.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long>  {
    Company findByUNP(int UNP);
}
