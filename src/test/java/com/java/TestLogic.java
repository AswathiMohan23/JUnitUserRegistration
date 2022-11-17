package com.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class TestLogic {
    static UserRegistration userRegistration = new UserRegistration();

    @Test
    public void check_firstName_If_Valid_Return_True() throws InvalidDetailsException {
        boolean result=userRegistration.isValidName("Harry");
        try{
            result=userRegistration.isValidName("Harry123");
        }catch (InvalidDetailsException exception){
            System.out.println("Invalid FirstName Harry123");
        }
    }
    @Test
    public void check_SecondName_If_Valid_Return_True() throws InvalidDetailsException {
        userRegistration.isValidName("Potter");
        try{
            userRegistration.isValidName("Potter123");
        }catch (InvalidDetailsException exception){
            System.out.println("Invalid SecondName Potter123");
        }
    }

    @Test
    public void check_MailID_if_Valid_Return_True() throws InvalidDetailsException {
        userRegistration.isEmailValid("abc@yahoo.com");
        userRegistration.isEmailValid("abc-100@yahoo.com");
        userRegistration.isEmailValid("abc111@abc.com");
        userRegistration.isEmailValid("abc.100@yahoo.com");
        userRegistration.isEmailValid("abc-100@abc.net");
        userRegistration.isEmailValid("abc.100@abc.com.au");
        //assertEquals("abc@1.com", UserRegistration.isEmailValid("abc@1.com"));
        userRegistration.isEmailValid("abc@gmail.com.com");
        userRegistration.isEmailValid("abc+100@gmail.com");
        try{
            userRegistration.isEmailValid("abc@1.com");
        }catch (InvalidDetailsException exception){
            System.out.println("Invalid email abc@1.com ");
        }
    }
    @Test
    public void check_PhoneNumber_If_Correct_return_True() throws InvalidDetailsException {
        userRegistration.isValidPhoneNumber("91 9734567892");

        try{
            userRegistration.isValidPhoneNumber("41 9734567892");

        }catch (InvalidDetailsException exception){
            System.out.println("Invalid phone number 41 9734567892 ");
        }
    }
    @Test
    public void check_Password_If_Correct_return_True() throws InvalidDetailsException {
        UserRegistration.isValidPassword("aAbcd@#1234");
        try{
            UserRegistration.isValidPassword("aAbcd") ;
        }catch (InvalidDetailsException exception){
            System.out.println("Invalid password aAbcd");
        }
    }

   /* @Test
    public void check_All_The_Entries_And_IF_True_Return_Happy() throws InvalidDetailsException {
        assertEquals("Happy", UserRegistration.isEveryParametersValid("mood"));


    }*/
}

