public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "widy";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent)child;
        parent.doIt(); // terjadi method overiding karena method si child itu menimpa method si parent
        System.out.println(parent.name); // terjadi variable hiding karena properti yg digunakan adalah
        // properti milik parent yg blm di set. dan properti child itu di hide dan di ganti dgn
        // properti milik parent
    }
}
