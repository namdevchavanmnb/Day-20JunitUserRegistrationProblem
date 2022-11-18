package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class EmailValidationTest {
    private final String email;
    private final Boolean expectedResult;
    public EmailValidation emailValidation;

    public EmailValidationTest(String email, Boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initilize(){
        emailValidation=new EmailValidation();
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true}});
    }
    @Test
    public void testEmailValidation(){
        System.out.println(email+ "======== is valid");
        Assert.assertEquals(expectedResult,emailValidation.checkEmail(email));
    }
}