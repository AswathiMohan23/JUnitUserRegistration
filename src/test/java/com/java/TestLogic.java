package com.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class TestLogic {
    static ArrayList<String> list=new ArrayList<String>();

    @Test
    public void check_firstName_If_Valid_Return_True(){
        assertEquals("Harry", UserRegistration.isValidName("Harry"));
    }

    @Test
    public void check_SecondName_If_Valid_Return_True(){
        assertEquals("Potter", UserRegistration.isValidName("Potter"));
    }
    @Test
    public void check_MailID_if_Valid_Return_True(){
        assertEquals("abc@yahoo.com", UserRegistration.isEmailValid("abc@yahoo.com"));
        assertEquals("abc-100@yahoo.com", UserRegistration.isEmailValid("abc-100@yahoo.com"));
        assertEquals("abc111@abc.com", UserRegistration.isEmailValid("abc111@abc.com"));
        assertEquals("abc.100@yahoo.com", UserRegistration.isEmailValid("abc.100@yahoo.com"));
        assertEquals("abc-100@abc.net", UserRegistration.isEmailValid("abc-100@abc.net"));
        assertEquals("abc.100@abc.com.au", UserRegistration.isEmailValid("abc.100@abc.com.au"));
        //assertEquals("abc@1.com", UserRegistration.isEmailValid("abc@1.com"));
        assertEquals("abc@gmail.com.com", UserRegistration.isEmailValid("abc@gmail.com.com"));
        assertEquals("abc+100@gmail.com", UserRegistration.isEmailValid("abc+100@gmail.com"));
    }
    @Test
    public void check_PhoneNumber_If_Correct_return_True(){
        assertEquals("91 9734567892", UserRegistration.isValidPhoneNumber("91 9734567892"));
    }
    @Test
    public void check_Password_If_Correct_return_True(){
        assertEquals("aAbcd@#1234", UserRegistration.isValidPassword("aAbcd@#1234"));
    }
}
