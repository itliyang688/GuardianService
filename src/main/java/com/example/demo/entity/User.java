package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.transaction.annotation.Transactional;

@TableName("users")
public class User {

    @TableField("id")
    private String id;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("task")
    private String task;

    @TableField("thestore")
    private String thestore;

    @TableField("thecustomer")
    private String thecustomer;

    public String getThestore() {
        return thestore;
    }

    public void setThestore(String thestore) {
        this.thestore = thestore;
    }

    public String getThecustomer() {
        return thecustomer;
    }

    public void setThecustomer(String thecustomer) {
        this.thecustomer = thecustomer;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }






    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }



}
