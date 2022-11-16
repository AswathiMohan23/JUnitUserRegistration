package com.java;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static String isValidName(String name) {
        String result = nameValidation(name);
        return result;
    }
    private static String nameValidation(String name){
        ArrayList<String> list=new ArrayList<String>();
        boolean result;
        String regex="[A-Z]{1}[a-z]{3,}";// {3,} means above 3
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(name);
        result=matcher.matches();
        if(result==true)
            return  name;
        else
            return null;
    }

    static String isEmailValid(String email){
        boolean result ;
        String regex="^[a-z0-9+_.-]+@+[a-z]+.+[a-z]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        result=matcher.matches();
        if(result==true)
            return email;
        else
            return null;
    }
    static String isValidPhoneNumber(String phoneNumber) {
        String regex="[91]+() +[789][0-9]{9}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(phoneNumber);
        boolean result=matcher.matches();
        if(result==true)
            return phoneNumber;
        else
            return null;
    }
}





