package lamda_Exp_23;

public class UserValidationException extends Exception {
    public String message;

    public UserValidationException(String message) {
        this.message = message;
    }
}