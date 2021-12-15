package com.example.demo.controller;

import com.example.demo.entity.LoginVo;
import com.example.demo.entity.User;
import com.example.demo.service.LoginService;
import com.example.demo.service.impl.LoginServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录功能
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginServiceImpl loginServiceimpl;

    /**
     * 验证用户名密码
     * @param
     * @return
     */
    @ApiOperation(value="用户登录")
    @PostMapping("/loginInfo")
    public LoginVo login(User user){
        return loginService.login(user);
    }
    @ApiOperation(value="修改用户信息")
    @PostMapping("/loginupdate")
    public int updateuser(@RequestBody User user){
        return loginService.updateuser(user);
    }


//    @ApiOperation(value="修改头像")
//    @PostMapping("/uploadOSS")
//    public Result<String> uploadCompanyLogo(MultipartFile file) {
//        String logoUrl = loginServiceimpl.uploadCompanyLogo(file);
//        return Result.success(logoUrl);
//    }

}
