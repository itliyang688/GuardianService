package com.example.demo.entity;

import java.util.List;

public class DataBean {
        /**
         * fullName : 武则天13
         * userName : 123
         * passWord : 123
         * phoneNum : 123
         * address : 北京天安门对面哈
         * role : 测试
         * company : 636020565467586341
         * department : 636020565467676346
         * filePath : http://211.143.85.18:51090/AppServer/pictures/user/tabkePicture.jpg
         * menus : [{"menuId":"1","menuName":"任务","menuSize":null},{"menuId":"2","menuName":"客户","menuSize":null},{"menuId":"3","menuName":"店铺","menuSize":null},{"menuId":"4","menuName":"发现","menuSize":null},{"menuId":"5","menuName":"我的","menuSize":null},{"menuId":"101","menuName":"我的警情","menuSize":null},{"menuId":"103","menuName":"认店任务","menuSize":null},{"menuId":"104","menuName":"装机任务","menuSize":null},{"menuId":"106","menuName":"领料任务","menuSize":null},{"menuId":"107","menuName":"退料任务","menuSize":null},{"menuId":"108","menuName":"移机任务","menuSize":null},{"menuId":"109","menuName":"拆机任务","menuSize":null},{"menuId":"110","menuName":"维修任务","menuSize":null},{"menuId":"111","menuName":"拜访任务","menuSize":null},{"menuId":"112","menuName":"收费任务","menuSize":null},{"menuId":"114","menuName":"投保任务","menuSize":null},{"menuId":"105","menuName":"测试任务","menuSize":null},{"menuId":"501","menuName":"上线工具","menuSize":null},{"menuId":"502","menuName":"管理工具","menuSize":null},{"menuId":"503","menuName":"参数设置工具","menuSize":null}]
            */

        private String fullName;
        private String userName;
        private String passWord;
        private String phoneNum;
        private String address;
        private String role;
        private String company;
        private String department;
        private String filePath;
        private List<MenusBean> menus;

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassWord() {
            return passWord;
        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public void setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public List<MenusBean> getMenus() {
            return menus;
        }

        public void setMenus(List<MenusBean> menus) {
            this.menus = menus;
        }

        public  class MenusBean {
            /**
             * menuId : 1
             * menuName : 任务
             * menuSize : null
             */

            private String menuId;
            private String menuName;
            private Object menuSize;

            public String getMenuId() {
                return menuId;
            }

            public void setMenuId(String menuId) {
                this.menuId = menuId;
            }

            public String getMenuName() {
                return menuName;
            }

            public void setMenuName(String menuName) {
                this.menuName = menuName;
            }

            public Object getMenuSize() {
                return menuSize;
            }

            public void setMenuSize(Object menuSize) {
                this.menuSize = menuSize;
            }
        }
    }