package com.example.demo.entity;

import lombok.Data;

import java.util.List;

//@NoArgsConstructor
@Data
public class UsersResult {

    /**
     * code : 1
     * msg : ok
     * data : [{"fullName":"武则天13","userName":"123","passWord":"123","phoneNum":"123","address":"北京天安门对面哈","role":"测试","company":"636020565467586341","department":"636020565467676346","filePath":"http://211.143.85.18:51090/AppServer/pictures/user/tabkePicture.jpg","menus":[{"menuId":"1","menuName":"任务","menuSize":null},{"menuId":"2","menuName":"客户","menuSize":null},{"menuId":"3","menuName":"店铺","menuSize":null},{"menuId":"4","menuName":"发现","menuSize":null},{"menuId":"5","menuName":"我的","menuSize":null},{"menuId":"101","menuName":"我的警情","menuSize":null},{"menuId":"103","menuName":"认店任务","menuSize":null},{"menuId":"104","menuName":"装机任务","menuSize":null},{"menuId":"106","menuName":"领料任务","menuSize":null},{"menuId":"107","menuName":"退料任务","menuSize":null},{"menuId":"108","menuName":"移机任务","menuSize":null},{"menuId":"109","menuName":"拆机任务","menuSize":null},{"menuId":"110","menuName":"维修任务","menuSize":null},{"menuId":"111","menuName":"拜访任务","menuSize":null},{"menuId":"112","menuName":"收费任务","menuSize":null},{"menuId":"114","menuName":"投保任务","menuSize":null},{"menuId":"105","menuName":"测试任务","menuSize":null},{"menuId":"501","menuName":"上线工具","menuSize":null},{"menuId":"502","menuName":"管理工具","menuSize":null},{"menuId":"503","menuName":"参数设置工具","menuSize":null}]}]
     */

    private String code;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

}
