package programmer.zaman.now.aplikasi;

import programmer.zaman.now.data.CreateUserRequest;
import programmer.zaman.now.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("widy");
        request.setPassword("abcd");
        request.setName("widy");

        ValidationUtil.validationReflection(request);
    }
}
