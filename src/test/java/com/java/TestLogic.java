package com.java;

import org.junit.Test;

import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class TestLogic {
    @Test
    public void firstNameValidation(){
        assertEquals("Harry", UserRegistration.isValidFirstName("Harry"));
    }
}
