package programmer.zaman.now.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("iPhone",30000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);
    }
}
