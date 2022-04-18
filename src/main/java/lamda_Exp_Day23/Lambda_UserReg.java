package lamda_Exp_Day23;

import java.util.regex.Pattern;

@FunctionalInterface
	interface Check {
	    boolean check(String a, String b, String c) throws Invalid_User;
	}
	public class Lambda_UserReg {
		
		public static void main(String[] args) throws Invalid_User {
			
	        Check firstName = (String pattern, String fname, String mood) -> {try {
	            if (mood.equals("Happy")) {
	                if (Pattern.matches(pattern, fname))
	                    return true;
	                else
	                    return false;
	            } else
	                return false;
	        }catch (NullPointerException e) {
	            throw new Invalid_User("Please enter proper message");
	        }};}}
		          

