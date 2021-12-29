package com.example.demo.entity;

import java.util.List;

public class Contactorsone {

    /**
     * contactors : [{"conType":"普通客户","name":"刘艺","position":0,"qq":"87122398","remark":"来了","telephone":"15865584450","weixin":"156848523"}]
     * floor : 10
     * industry_id : 通讯行业
     * inforshopID : 15811450852
     * shop_address : 北京市西钓鱼台
     * shop_has_device : 2
     * shop_lat : 39.928053952755555
     * shop_lng : 116.30589605302117
     * shop_look_type : 巡警
     * shop_name : 北京第一店铺
     * size : 300
     * userName : 123
     */

    private String floor;
    private String industry_id;
    private String inforshopID;
    private String shop_address;
    private String shop_has_device;
    private String shop_lat;
    private String shop_lng;
    private String shop_look_type;
    private String shop_name;
    private String size;
    private String userName;
    private List<ContactorsBean> contactors;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getIndustry_id() {
        return industry_id;
    }

    public void setIndustry_id(String industry_id) {
        this.industry_id = industry_id;
    }

    public String getInforshopID() {
        return inforshopID;
    }

    public void setInforshopID(String inforshopID) {
        this.inforshopID = inforshopID;
    }

    public String getShop_address() {
        return shop_address;
    }

    public void setShop_address(String shop_address) {
        this.shop_address = shop_address;
    }

    public String getShop_has_device() {
        return shop_has_device;
    }

    public void setShop_has_device(String shop_has_device) {
        this.shop_has_device = shop_has_device;
    }

    public String getShop_lat() {
        return shop_lat;
    }

    public void setShop_lat(String shop_lat) {
        this.shop_lat = shop_lat;
    }

    public String getShop_lng() {
        return shop_lng;
    }

    public void setShop_lng(String shop_lng) {
        this.shop_lng = shop_lng;
    }

    public String getShop_look_type() {
        return shop_look_type;
    }

    public void setShop_look_type(String shop_look_type) {
        this.shop_look_type = shop_look_type;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<ContactorsBean> getContactors() {
        return contactors;
    }

    public void setContactors(List<ContactorsBean> contactors) {
        this.contactors = contactors;
    }

}
