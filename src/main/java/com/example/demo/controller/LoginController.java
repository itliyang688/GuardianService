package com.example.demo.controller;

import com.example.demo.entity.Contactorsone;
import com.example.demo.entity.HomePage;
import com.example.demo.entity.User;
import com.example.demo.entity.UsersResult;
import com.example.demo.enums.ResponseEnum;
import com.example.demo.service.LoginService;
import com.example.demo.service.impl.LoginServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 登录功能
 */
@RestController
@RequestMapping("/AppServer/rest")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginServiceImpl loginServiceimpl;

    /**
     * 验证用户名密码
     *
     * @param
     * @return
     */
    @ApiOperation(value = "用户登录")
    @GetMapping("/user/login")
    public UsersResult login(User user) {
        return loginService.login(user);
    }

    @ApiOperation(value = "更新用户名")
    @GetMapping("/user/name")
    public UsersResult updateuser(User user) {
        return loginService.updateuser(user);
    }


    @ApiOperation(value = "修改头像")
    @PostMapping("/user/picture")
    public UsersResult uploadCompanyLogo(@RequestBody MultipartFile file, String username) {
        UsersResult logoUrl = null;
        try {
            logoUrl = loginServiceimpl.uploadCompanyLogo(file, username);
        } catch (IOException e) {
            throw new RuntimeException(ResponseEnum.ERROR.getMessage());
        }
        return logoUrl;
    }

    @ApiOperation(value = "首页任务")
    @GetMapping("/menu/task")
    private HomePage homePageTask(User user) {
        return loginService.homePageTask(user);
    }

    @ApiOperation(value = "新增店铺")
    @PostMapping("/shop/add")
    public Map<String, Object> store(@RequestBody Contactorsone contactors) {
        HashMap<String, Object> map = new HashMap<>();


        if (contactors == null) {
            map.put("1", "参数错误");
            return map;
        }
        int store = loginService.store(contactors);

        if (store == 0) {
            map.put("code", "0");
            map.put("msg", "新增失败");
            return map;
        } else {
            map.put("code", "1");
            map.put("msg", "新增成功");
            return map;
        }
    }
}
