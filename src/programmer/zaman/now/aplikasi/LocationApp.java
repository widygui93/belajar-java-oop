package programmer.zaman.now.aplikasi;

import programmer.zaman.now.data.City;
import programmer.zaman.now.data.Location;

public class LocationApp {
    public static void main(String[] args) {
       // var location = new Location(); // error karena class abstract tidak bisa di initialized

        var city = new City();
        city.name = "Medan";
        System.out.println(city.name);
    }
}
