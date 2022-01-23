package programmer.zaman.now.aplikasi;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Widy");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
//        System.out.println(customer.getLevel());
        Level lvl = customer.getLevel();
        System.out.println(lvl);
        System.out.println(lvl.getDescription());

        // konversi enum ke string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        // konversi string ke enum
        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        // utk lihat semua option enum
        System.out.println("cetak semua option enum Level");
        Level[] levels = Level.values();
        for (var levelValue: levels) {
            System.out.println(levelValue);
        }
    }
}
