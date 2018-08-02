package com.personal.freedom.user.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 郭永胜123
 * @since 2018-08-02
 */
public class MainUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;
    private String userName;
    private String userPassword;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "MainUser{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", userPassword=" + userPassword +
        "}";
    }
}
