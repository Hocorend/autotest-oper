package oper_test.service;

import oper_test.model.User;

public class UserCreator {

    public static final String USER_NAME = "testdata.user.name";
    public static final String USER_PASSWORD = "testdata.user.password";

    public static User createWithEmptyUsername(){
        return new User("",TestDataReader.getTestData(USER_PASSWORD));
    }

    public static User createWithEmptyPassword(){
        return new User(TestDataReader.getTestData(USER_NAME),"");
    }

    public static User createEmptyUser(){
        return new User("","");
    }
}
