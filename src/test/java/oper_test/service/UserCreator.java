package oper_test.service;

import oper_test.model.User;

public class UserCreator {

    public static final String USER_NAME = System.getProperty("UserLogin");
    public static final String USER_PASSWORD = System.getProperty("UserPassword");

    public static User createWithEmptyUsername(){
        return new User("",USER_PASSWORD);
    }

    public static User createWithEmptyPassword(){
        return new User(USER_NAME,"");
    }

    public static User createEmptyUser(){
        return new User("","");
    }
}
