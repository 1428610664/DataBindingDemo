package com.hlq.databindingdemo.bean;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/11
 * desc   : 测试使用实体类
 * version: 1.0
 */
public class UserBean {

    private String userName;
    private String userAge;
    private String userAddress;
    private int userCount;

    public UserBean(String userName) {
        this.userName = userName;
    }

    public UserBean(String userName, String userAge, String userAddress) {
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
    }

    public UserBean(String userName, String userAge, String userAddress, int userCount) {
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
        this.userCount = userCount;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
