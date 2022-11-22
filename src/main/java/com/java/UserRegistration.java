package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static int count = 0;


    private static boolean nameValidation(String name) throws InvalidDetailsException {
        String regex = "[A-Z]{1}[a-z]{3,}";// {3,} means above 3
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    static boolean isValidName(String name) throws InvalidDetailsException {
        LambdaUserRegistration lambdaFunction = (String i) -> {
            if (nameValidation(name))
                // count++;
                return true;
            return false;
        };
        throw new InvalidDetailsException();
    }

    static boolean isEmailValid(String email) throws InvalidDetailsException {
        String regex = "^[a-z0-9+_.-]+@+[a-z]+.+[a-z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        matcher.matches();
        if (matcher.matches()) {
            count++;
            return true;
        }
        else
            return false;
    }


    static boolean emailValidation(String email) throws InvalidDetailsException {
        LambdaUserRegistration lambdaFunction = (String i) -> {
            if (isEmailValid(email))
                // count++;
                return true;
            return false;
        };
        throw new InvalidDetailsException();

    }


    static boolean isValidPhoneNumber(String phoneNumber) throws InvalidDetailsException {
        String regex = "[91]+() +[789][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        matcher.matches();
        LambdaUserRegistration lambdaFunction = (String i) -> {
            if (matcher.matches())
                // count++;
                return true;
            return false;
        };
        throw new InvalidDetailsException();

    }

    static String isValidPassword(String password) throws InvalidDetailsException{
        //  (?=.*?[A-Z]) ---> atleast 1 uppercase;    (?=.*?[a-z]) ----> atleast 1 lower case;
        //  (?=.*?[0-9]) ----> atleast 1 digit;        (?=.*?[#?!@$%^&*-]) ----> atleast 1 special character

        String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        LambdaUserRegistration lambdaFunction = (String i) -> {
            if (matcher.matches())
                // count++;
                return true;
            return false;
        };
        throw new InvalidDetailsException();
    }



    /*  static String isEveryParametersValid(String mood) throws InvalidDetailsException {
        System.out.println("count : " + count);
        if (count != 10) { // gave 10 because we are checking more than 5 emails seperately so count increments
            throw new InvalidDetailsException("Details Invalid");
        } else {
            mood = "Happy";
            return mood;
        }
    }*/

}






