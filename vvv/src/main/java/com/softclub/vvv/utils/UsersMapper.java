package com.softclub.vvv.utils;

import com.softclub.vvv.dto.UsersDto;
import com.softclub.vvv.models.Users;
import org.springframework.stereotype.Service;

@Service
public class UsersMapper {

    public UsersDto mapToUsersDto(Users users)
    {
        UsersDto dto = new UsersDto();
        dto.setLogin(users.getLogin());
        dto.setPassw(users.getPassw());
        dto.setId(users.getId());
        return dto;
    }

    public Users mapToUsers(UsersDto dto)
    {
        Users users=new Users();
        users.setLogin(dto.getLogin());
        users.setPassw(dto.getPassw());
        users.setId(dto.getId());
        return users;
    }


}
