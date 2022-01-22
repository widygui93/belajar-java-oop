package programmer.zaman.now.data;

public class Application {
    public static final int PROCESSORS;

    // hanya bisa akses sesama static
    // baik itu field/property atau method
    static {
        System.out.println("akses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
