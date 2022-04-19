package lamda_Exp_Day23;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Demo{
		 Scanner sc = new Scanner(System.in);

		    public static void main(String[] args) {
		    	Regex_Demo regexDemo = new Regex_Demo();
		        System.out.println("Enter first name");
		        regexDemo.firstName();
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
		}