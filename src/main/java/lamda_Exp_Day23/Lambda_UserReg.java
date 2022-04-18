package lamda_Exp_Day23;

import java.util.regex.Pattern;

@FunctionalInterface
interface Check {
    boolean check(String a, String b, String c) throws Exception;
}
public class Lambda_UserReg {
	public static void main(String[] args) throws Exception {
        Check firstName = (String pattern, String fname, String mood) -> {try {
            if (mood.equals("Happy")) {
                if (Pattern.matches(pattern, fname))
                    return true;
                else
                    return false;
            } else
                return false;
        }catch (NullPointerException e) {
            throw new Exception("Please enter proper message");
        }};
        Check lastName = (String pattern, String lname, String mood) -> {try {
            if (mood.equals("Happy")) {
                if (Pattern.matches(pattern, lname))
                    return true;
                else
                    return false;
            } else
                return false;
        }catch (NullPointerException e) {
            throw new Exception("Please enter proper message");
        }};    
	
	}}
	          



