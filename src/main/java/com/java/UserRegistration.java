package com.java;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static int count=0;
    static String isValidName(String name, String partOfName, String ucNo) {
        count++;
        System.out.println("\n=========================================="+ucNo+"===============================================\n");
        boolean result = nameValidation(name);
        System.out.println("the name "+partOfName+" "+name+" is =====>>>>>  "+result);
        return name;
    }
    private static boolean nameValidation(String name){
        ArrayList<String> list=new ArrayList<String>();
        boolean result;
        String regex="[A-Z]{1}[a-z]{3,}";// {3,} means above 3
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(name);
        result=matcher.matches();
        if(result==true)
            list.add(name);
        else
            list.add("-------------");
        return result;
    }

    static String isEmailValid(String email){
        boolean result ;
        String regex="^[a-z0-9+_.-]+@+[a-z]+.+[a-z]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        result=matcher.matches();
        System.out.println("The email "+email+" is  =====>>>> "+result);
        return email;
    }
    }





