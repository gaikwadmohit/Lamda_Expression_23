import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lamda_Exp_23.UserValidation;
import lamda_Exp_23.UserValidationException;

import org.junit.Assert;



public class UserValidationTest {
    @Test
    public void givenFirstName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.firstNameValidation("Manish");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void giveLastName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.lastNameValidation("Kumar");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void givenEmail_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.emailValidation("mkaubr007@gmail.com");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception);
        }
    }

    @Test
    public void givenPhoneNumber_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.phoneNumberValidation("+918002695700");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void givenPassword_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.passwordValidation("qw1rt@Ms");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }


}
