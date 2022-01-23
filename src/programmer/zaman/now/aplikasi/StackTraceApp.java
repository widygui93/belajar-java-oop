package programmer.zaman.now.aplikasi;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (RuntimeException e){
            e.printStackTrace();
        }

    }

    public static void sampleError(){
        try {
            String[] names = {
                    "widy", "guilias"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
