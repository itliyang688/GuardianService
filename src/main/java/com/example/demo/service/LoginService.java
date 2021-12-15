package com.example.demo.service;

import com.example.demo.entity.LoginVo;
import com.example.demo.entity.User;


public interface LoginService {

     LoginVo login(User user);

     int updateuser(User user);

//    com.example.demo.entity.Result<String> uploadCompanyLogo(MultipartFile file) throws IOException;
}
