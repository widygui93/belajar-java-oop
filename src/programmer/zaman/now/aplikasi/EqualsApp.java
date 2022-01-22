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
        System.out.println(first.equals(second));// equals membandingkan nilai dari objek nya

        String third = "Widy Guilias";
        System.out.println(second == third);// ini kenapa true karena jika nilai ny sama maka
        //java secara pintar akan optimize memori jadi
        // nilai third yg sama akan di refer ke objek second
    }
}
