package com.java;

import org.junit.Test;

import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class TestLogic {
    @Test
    public void firstNameValidation(){
        assertEquals("Harry", UserRegistration.isValidName("Harry","FirstName","UC1"));
    }

    @Test
    public void secondNameValidation(){
        assertEquals("Potter", UserRegistration.isValidName("Potter","SecondName","UC2"));

    }

}
