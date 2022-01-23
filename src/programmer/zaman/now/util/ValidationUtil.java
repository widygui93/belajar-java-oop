package programmer.zaman.now.util;

import programmer.zaman.now.annotation.NotBlank;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.BlankException;
import programmer.zaman.now.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    // kalau checked exception wajib throws exception
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if (loginRequest.username() == null){
            throw new NullPointerException("username is null");
        } else if (loginRequest.username().isBlank()){
            throw new ValidationException("username is blank ");
        } else if (loginRequest.password() == null){
            throw new NullPointerException("password is null");
        } else if (loginRequest.password().isBlank()){
            throw new ValidationException("password is blank ");
        }
    }

    // tidak wajib throws BlankException
    // karena itu turunan dari RuntimeException
    public static void validateRuntime(LoginRequest loginRequest) throws BlankException {
        if (loginRequest.username() == null){
            throw new NullPointerException("username is null");
        } else if (loginRequest.username().isBlank()){
            throw new BlankException("username is blank ");
        } else if (loginRequest.password() == null){
            throw new NullPointerException("password is null");
        } else if (loginRequest.password().isBlank()){
            throw new BlankException("password is blank ");
        }
    }

    public static void validationReflection(Object object){

        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields){

            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null){
                //validate
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException e){
                    System.out.println("tidak bisa mengakses field " + field.getName());
                }
            }

        }
    }
}
