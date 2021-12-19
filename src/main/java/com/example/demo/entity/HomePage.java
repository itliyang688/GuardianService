package com.example.demo.entity;

import java.util.List;

public class HomePage {

    /**
     * code : 1
     * msg : ok
     * size : 12
     * data : [{"menuId":"101","menuName":"我的警情","menuSize":"0"},{"menuId":"103","menuName":"认店任务","menuSize":"0"},{"menuId":"104","menuName":"装机任务","menuSize":"0"},{"menuId":"106","menuName":"领料任务","menuSize":"0"},{"menuId":"107","menuName":"退料任务","menuSize":"0"},{"menuId":"108","menuName":"移机任务","menuSize":"0"},{"menuId":"109","menuName":"拆机任务","menuSize":"0"},{"menuId":"110","menuName":"维修任务","menuSize":"0"},{"menuId":"111","menuName":"拜访任务","menuSize":"0"},{"menuId":"112","menuName":"收费任务","menuSize":"0"},{"menuId":"114","menuName":"投保任务","menuSize":"0"},{"menuId":"105","menuName":"测试任务","menuSize":"0"}]
     */

    private String code;
    private String msg;
    private int size;
    private List<DataBeanone> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<DataBeanone> getData() {
        return data;
    }

    public void setData(List<DataBeanone> data) {
        this.data = data;
    }


}
