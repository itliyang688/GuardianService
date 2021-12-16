package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.entity.UsersResult;


public interface LoginService {

     UsersResult login(User user);

     int updateuser(User user);

//    com.example.demo.entity.Result<String> uploadCompanyLogo(MultipartFile file) throws IOException;
}
