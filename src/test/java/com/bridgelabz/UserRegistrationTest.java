package com.bridgelabz;


import org.junit.jupiter.api.*;

public class UserRegistrationTest {
    @BeforeAll
    static void beforeAllTestMsg() {
        System.out.println("Welcome to User Registration Problem");
    }
    @AfterAll
    static void afterAllTestPassedMsg(){
        System.out.println("All Test Case Passed");
    }

    @AfterEach
    public void afterEachTestPassMsg() {
        System.out.println("Passed");
    }

    @Test
    void given_first_name_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result = validation.checkFirstName("Namdev");
        Assertions.assertEquals(result, true);
    }

    @Test
    void given_last_name_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result1 = validation.checkLastName("Chavan");
        Assertions.assertEquals(result1, true);
    }

    @Test
    void given_email_id_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result2 = validation.checkemailId("namdevchavanmnb@gmail.com");
        Assertions.assertEquals(result2, true);
    }

    @Test
    void given_phoneNumber_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result3 = validation.phoneNumber("91 9604411890");
        Assertions.assertEquals(result3, true);
    }
    @Test
    void given_password_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result4 = validation.password("ksndfkdn");
        Assertions.assertEquals(result4, true);
    }
    @Test
    void given_password1_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result5 = validation.password2("Ksndfkdn");
        Assertions.assertEquals(result5, true);
    }
    @Test
    void given_password2_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result6 = validation.password3("Ksndkdv98");
        Assertions.assertEquals(result6, true);
    }  @Test
    void given_password3_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result7 = validation.password4("Ksndkdv98@");
        Assertions.assertEquals(result7, true);
    }
    @Test
    void given_emailId_should_return_True(){
        UserValidation validation = new UserValidation();
        Boolean result8 = validation.checkEmailSeperate("abc@yahoo.com");
        Assertions.assertEquals(result8, true);
    }
}