package com.example.demo.service;

import com.example.demo.entity.LoginVo;
import com.example.demo.entity.User;



public interface LoginService {

     LoginVo login(User user);

     int updateuser(User user);
}
