package com.softclub.vvv.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softclub.vvv.models.Company;

@Repository
public interface companyRepository extends CrudRepository<Company, Long>  {


}
