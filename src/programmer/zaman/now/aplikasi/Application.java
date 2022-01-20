package programmer.zaman.now.aplikasi;

//import programmer.zaman.now.data.Data;
//import programmer.zaman.now.data.Product;
import programmer.zaman.now.data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("iphone",30_000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
