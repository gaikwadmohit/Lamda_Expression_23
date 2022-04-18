package lamda_Exp_Day23;

import java.util.regex.Pattern;

public class User_Reg {
	public boolean firstName(String pattern,String firstName,String mood) throws Invalid_User {
        try {
            if (mood.equals("HAPPY")) {
                if (Pattern.matches(pattern, firstName))
                    return true;
                else
                    return false;
            } else
                return false;
        }catch (NullPointerException e) {
            throw new Invalid_User("Please enter proper message");
        }
}
}

