package com.softclub.vvv.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softclub.vvv.models.Empl;

@Repository
public interface emplRepository  extends CrudRepository<Empl,Long> {

    
}
