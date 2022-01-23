package programmer.zaman.now.aplikasi;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("widy", null);


        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        } catch (ValidationException e){
            System.out.println("Terjadi error dengan pesan: " + e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Terjadi error null: " + e.getMessage());
        }

        // jika blok catch ny menghasilkan print yg sama bisa di gabung seperti ini
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        } catch (ValidationException | NullPointerException e){
            System.out.println("Terjadi error dengan pesan: " + e.getMessage());
        } finally {
            System.out.println("error gak error tetep di eksekusi");
        }

    }
}
