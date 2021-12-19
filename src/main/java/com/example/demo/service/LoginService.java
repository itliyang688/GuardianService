package com.example.demo.service;

import com.example.demo.entity.HomePage;
import com.example.demo.entity.User;
import com.example.demo.entity.UsersResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface LoginService {

     UsersResult login(User user);

     UsersResult updateuser(User user);

    UsersResult uploadCompanyLogo(MultipartFile file, String username) throws IOException;

    HomePage homePageTask(User user);
}
