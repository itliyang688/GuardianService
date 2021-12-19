package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("menuusers")
@Data
public class MenuUsers {

    @TableField("menuid")
    private String menuid;

    @TableField("menuname")
    private String menuname;

    @TableField("menusize")
    private String menusize;

    @TableField("menus")
    private String menus;
}
