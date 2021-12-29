package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("thestote")
@Data
public class thestote {

    @TableField("thestoreId")
    private int thestoreId;

    @TableField("floor")
    private String floor;

    @TableField("industry_id")
    private String industry_id;

    @TableField("inforshopID")
    private String inforshopID;

    @TableField("shop_address")
    private String shop_address;

    @TableField("shop_has_device")
    private String shop_has_device;

    @TableField("shop_lat")
    private String shop_lat;

    @TableField("shop_lng")
    private String shop_lng;

    @TableField("shop_look_type")
    private String shop_look_type;

    @TableField("shop_name")
    private String shop_name;

    @TableField("size")
    private String size;

    @TableField("userName")
    private String userName;
}
