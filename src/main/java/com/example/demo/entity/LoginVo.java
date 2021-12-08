package com.example.demo.entity;

public class LoginVo {
    private boolean flag;

    private String msg;

    private int code;

    public boolean isFlag() {
        return flag;
    }

    public LoginVo() {
    }

    public LoginVo(boolean flag, String msg, int code) {
        this.flag = flag;
        this.msg = msg;
        this.code = code;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
