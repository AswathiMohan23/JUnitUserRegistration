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
        String regex="[A-Z]{1}[a-z]{3,}";// {3,} means above 3
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(name);
        matcher.matches();
        if(matcher.matches()==true)
            return  name;
        else
            return null;
    }

    static String isEmailValid(String email){
        String regex="^[a-z0-9+_.-]+@+[a-z]+.+[a-z]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        matcher.matches();
        if(matcher.matches()==true)
            return email;
        else
            return null;
    }
    static String isValidPhoneNumber(String phoneNumber) {
        String regex="[91]+() +[789][0-9]{9}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(phoneNumber);
        matcher.matches();
        if(matcher.matches()==true)
            return phoneNumber;
        else
            return null;
    }
    static String isValidPassword(String password) {
         //  (?=.*?[A-Z]) ---> atleast 1 uppercase;    (?=.*?[a-z]) ----> atleast 1 lower case;
        //  (?=.*?[0-9]) ----> atleast 1 digit;        (?=.*?[#?!@$%^&*-]) ----> atleast 1 special character

        String regex="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(password);
        if(matcher.matches()==true)
            return password;
        else
            return null;
    }
}






