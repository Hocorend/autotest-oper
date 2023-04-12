package oper_test.service;

import oper_test.model.User;

public class UserCreator {

    public static final String USER_NAME = "testdata.user.name";
    public static final String USER_PASSWORD = "testdata.user.password";

    private static final String USER_WRONG_PASSWORD = "%4/.&1F_w  rong";
    private static final String USER_WRONG_NAME = "%4/.&1F   2";

    public static User createWithEmptyUsername(){
        return new User("",TestDataReader.getTestData(USER_PASSWORD));
    }

    public static User createWithEmptyPassword(){
        return new User(TestDataReader.getTestData(USER_NAME),"");
    }

    public static User createEmptyUser(){
        return new User("","");
    }

    public static User createWithWrongUsername(){
        return new User(USER_WRONG_NAME,TestDataReader.getTestData(USER_PASSWORD));
    }

    public static User createWithWrongPassword(){
        return new User(TestDataReader.getTestData(USER_NAME),USER_WRONG_PASSWORD);
    }
}
