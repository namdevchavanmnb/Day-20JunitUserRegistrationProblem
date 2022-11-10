package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void given_first_name_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result=validation.checkFirstName("Aditya");
        Assertions.assertEquals(result,true);
    }
}



