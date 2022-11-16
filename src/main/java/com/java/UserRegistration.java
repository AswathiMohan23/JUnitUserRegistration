package com.java;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static ArrayList<String> list=new ArrayList<String>();
    static String isValidFirstName(String firstName) {
        String name=firstName;
        System.out.println("\n========================================== UC1 ===============================================\n");
        boolean result = nameValidation("Harry");
        System.out.println("the first name is =====>>>>>  "+result);
        return name;
    }
    private static boolean nameValidation(String name){
        boolean result=false;
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

    }




