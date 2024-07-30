package com.softclub.vvv.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softclub.vvv.models.Users;


@Repository
public interface usersRepository  extends CrudRepository<Users,Long>{

    //public List<Users>findById(Long id);

}
