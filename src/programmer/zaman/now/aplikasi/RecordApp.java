package programmer.zaman.now.aplikasi;

import programmer.zaman.now.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("widygui", "abcdef");

        // cara getter nya bukan pake getUsername()
        // tapi nama field nya di tambah ()
        // seperti panggil method
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);


        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("widy"));
        System.out.println(new LoginRequest("widy","bcder"));
    }
}
