package lamda_Exp_23;

import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class EmailValidation {
	    public static boolean email(String email) {
	        String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z0-9]+.(com|net)(.[a-z]{2,3}){0,1}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(email)
	        return matcher.matches();
	    }
	}