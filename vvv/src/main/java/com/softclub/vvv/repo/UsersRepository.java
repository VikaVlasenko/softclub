package com.softclub.vvv.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softclub.vvv.models.Users;

import java.util.List;


@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {


    Users findByLogin(String Login);

}
