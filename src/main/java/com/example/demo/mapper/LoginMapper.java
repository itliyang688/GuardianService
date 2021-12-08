package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;



@Mapper
@Repository
public interface LoginMapper {
    @Select("select * from users where username = #{username}")
    User getwdfls(String username);

    @Update("update users set username=#{username},password=#{password},task=#{task},thestore=#{thestore},thecustomer=#{thecustomer} where id=#{id}")
    int updateuser(User user);

}


