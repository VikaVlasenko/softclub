package com.softclub.vvv.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softclub.vvv.models.Empl;

import java.util.List;

@Repository
public interface EmplRepository extends CrudRepository<Empl,Long> {

    List<Empl> findByUNP(int UNP);

}
