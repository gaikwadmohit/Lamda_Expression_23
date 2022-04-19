package lamda_Exp_23;

public class User_Validation_Exception extends Exception {

    String message;

    public User_Validation_Exception(String message) {
        this.message = message;
    }
}
