package programmer.zaman.now.aplikasi;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Widy";
        first = first + " " + "Guilias";
        System.out.println(first);

        String second = "Widy Guilias";
        System.out.println(second);

        // == membandingkan objek bukan nilai dari objek tersebut
        System.out.println(first == second);
    }
}
