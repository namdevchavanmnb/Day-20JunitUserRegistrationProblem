package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
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
        void given_email_id_should_returnTrue () {
            UserValidation validation = new UserValidation();
            Boolean result2 = validation.checkemailId("namdevchavanmnb@gmail.com");
            Assertions.assertEquals(result2, true);
        }
    }




