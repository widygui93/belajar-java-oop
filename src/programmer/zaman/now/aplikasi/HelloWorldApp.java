package programmer.zaman.now.aplikasi;

import programmer.zaman.now.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        // anonymous class hanya bisa di pake sekali
        // tidak bisa reuse
        HelloWorld english = new HelloWorld(){

            public void sayHello() {
                System.out.println("Hello");
            }


            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld(){

            public void sayHello() {
                System.out.println("Halo");
            }


            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Widy");

        indonesia.sayHello();
        indonesia.sayHello("Widy");
    }
}
