package com.softclub.vvv.service;
import com.softclub.vvv.models.Users;
import com.softclub.vvv.dto.UsersDto;
import com.softclub.vvv.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

import com.softclub.vvv.utils.UsersMapper;


@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersMapper usersMapper;


    public  List<UsersDto> readAll()
    {
        List<Users> users = (List<Users>) usersRepository.findAll();
        return users.stream()
                .map(usersMapper::mapToUsersDto)
                .collect(Collectors.toList());
   }

   public Users getByLogin(String name)
   {
       Users users=usersRepository.findByLogin(name);
       return users;

   }

   public void deleteId(long Id)
   {
       Users user=usersRepository.findById(Id).orElseThrow();
       usersRepository.delete(user);
   }


   public void addUser(String Login,String Password)
   {
       Users us= new Users();
       us.setLogin(Login);
       us.setPassw(Password);
       usersRepository.save(us);

   }


}
