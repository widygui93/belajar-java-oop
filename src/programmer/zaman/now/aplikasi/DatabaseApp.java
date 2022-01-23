package programmer.zaman.now.aplikasi;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {

        connectDatabase("widy",null);
        System.out.println("sukses");
    }

    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("tidak bisa connect ke database");
        }
    }
}
