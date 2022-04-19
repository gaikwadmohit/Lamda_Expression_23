package lamda_Exp_23;

import java.util.regex.Pattern;

import org.hamcrest.Matcher;
import org.junit.Test;

import junit.framework.Assert;


public class UserValidationTest {
    @Test
    public void givenFirstName_Validation() {
        UserValidationTest validation = new UserValidationTest();
        boolean actualResult = true;
        try {
            actualResult = validation.firstName("Manish");
        } catch (Exception exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void lastName_Validation() {
    	UserValidationTest validation = new UserValidationTest();
        boolean actualResult = true;
        try {
            actualResult = validation.lastName("Kumar");
        } catch (Exception exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void email_Validation() {
    	UserValidationTest validation = new UserValidationTest();
        boolean actualResult = true;
        try {
            actualResult = validation.email("mkaubr007@gmail.com");
        } catch (Exception exception) {
            Assert.assertEquals(actualResult, exception);
        }
    }

    @Test
    public void phoneNumber_Validation() {
    	UserValidationTest validation = new UserValidationTest();
        boolean actualResult = true;
        try {
            actualResult = validation.phoneNumber("+918002695700");
        } catch (Exception exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void password_Validation() {
        UserValidationTest validation = new UserValidationTest();
        boolean actualResult=true;
        try {
            actualResult = validation.password("qw1rt@Ms");
        }catch (Exception exception) {
            Assert.assertEquals(actualResult,exception.message);
        }
    }
}