package lamda_Exp_23;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Demo {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Regex_Demo regexDemo = new Regex_Demo();
	        System.out.println("Enter first name");
	        regexDemo.firstName();
	        System.out.println("Enter last name");
	        regexDemo.lastName();
	        System.out.println("Enter email");
	        regexDemo.email();
	        System.out.println("Enter mobile number");
	        regexDemo.phoneNumber();
	        System.out.println("Enter password");
	        regexDemo.password();
	        System.out.println("Passward with 1 Uppercase");
	        regexDemo.PasswardWith1Uppercase();
	        System.out.println("Passward with 1 Numeric");
	        regexDemo.PasswardWith1Numeric();
	}

	public void firstName() {
		String input = sc.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
	  public void lastName() {
	        String input = sc.next();
	        String regex = "^[a-zA-Z]*$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);
	        if (matcher.matches()) {
	            System.out.println("Valid");
	        } else {
	            System.out.println("Invalid");
	        }
	    }

	    public void email() {
	        String input = sc.next();
	        String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}+.([a-z]{2,3})$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);
	        if (matcher.matches()) {
	            System.out.println("Valid");
	        } else {
	            System.out.println("Invalid");
	        }
	    }
	    public void phoneNumber() {
	        String input = sc.next();
	        String regex = "(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);
	        if (matcher.matches()) {
	            System.out.println("Valid");
	        } else {
	            System.out.println("Invalid");
	        }
	    }

	    public void password() {
	        String input = sc.next();
	        String regex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);
	        if (matcher.matches()) {
	            System.out.println("Valid");
	        } else {
	            System.out.println("Invalid");
	        }
	    }
	    public void PasswardWith1Uppercase() {

			// scanning
			String line = "Abcdefoo";
			String pattern = "^[A-Z]{1}[a-z]*";

			// Create pattern object
			Pattern pat = Pattern.compile(pattern);

			// matching object create
			Matcher mat = pat.matcher(line);

			// Check Matching or not
			boolean result5 = mat.matches();
			System.out.println("passward with one U/C Matching result is " + result5);
			System.out.println();

		}
	    public void PasswardWith1Numeric() {

			// scanning
			String line = "Abcdefoo123";
			String pattern = "^[A-Z]{1}[a-z][0-9]$";

			// Create pattern object
			Pattern pat = Pattern.compile(pattern);

			// matching object create
			Matcher mat = pat.matcher(line);

			// Check Matching or not
			boolean result6 = mat.matches();
			System.out.println("passward with Numeric Number Matching result is " + result6);
			System.out.println();
		}
	

}