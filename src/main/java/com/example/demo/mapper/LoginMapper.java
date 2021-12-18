package com.example.demo.mapper;

import com.example.demo.entity.DataBean;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface LoginMapper {
    @Select("select * from users where username = #{username} limit 1")
    DataBean getwdfls(String username);

    @Update("update users set fullname=#{fullname} where username=#{username}")
    int updateuser(User user);

    @Update("update users set filepath=#{filepath} where username=#{username}")
    int uploadCompanyLogo(@Param("filepath") String filepath, @Param("username") String username);

}


