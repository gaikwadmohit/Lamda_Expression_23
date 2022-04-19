package lamda_Exp_23;

@FunctionalInterface
public interface UserValidate<T> {
    boolean validate(T param);
}