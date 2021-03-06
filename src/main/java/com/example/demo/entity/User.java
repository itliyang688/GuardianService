package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@TableName("users")
@Data
public class User {

    @TableField("id")
    private String id;

    @TableField("username")
    private String username;

    @TableField("password")
    private String passwd;

    @TableField("fullname")
    private String fullname;

    @TableField("phonenum")
    private String phonenum;

    @TableField("address")
    private String address;

    @TableField("role")
    private String role;

    @TableField("company")
    private String company;

    @TableField("department")
    private String department;

    @TableField("filepath")
    private String filepath;

    @TableField("menus")
    private List<DataBean> menus;
}
