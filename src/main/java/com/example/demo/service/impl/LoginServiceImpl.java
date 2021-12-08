package com.example.demo.service.impl;

import com.example.demo.entity.LoginVo;
import com.example.demo.entity.User;
import com.example.demo.mapper.LoginMapper;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper mapper;
    
    @Override
    public LoginVo login(User user) {
        String username = user.getUsername();

        User user1 = mapper.getwdfls(username);
        LoginVo dengluVo = new LoginVo();

        if (user1 != null) {
            String password = user.getPassword();
            String dbPwd = user1.getPassword();
            if (password.equals(dbPwd)) {
                dengluVo.setCode(200);
                dengluVo.setFlag(true);
                dengluVo.setMsg("登陆成功");
                return dengluVo;
            } else {
                dengluVo.setCode(500);
                dengluVo.setFlag(false);
                dengluVo.setMsg("登陆失败");
            }
        } else {
            dengluVo.setMsg("登陆失败");
        }
        return dengluVo;
    }

    @Override
    public int updateuser(User user) {
        return mapper.updateuser(user);
    }


}
