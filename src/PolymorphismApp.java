public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Widy");
        employee.sayHello("Budi");

        employee = new Manager("Widy");
        employee.sayHello("Budi");

        employee= new VicePresident("Widy");
        employee.sayHello("Budi");

        sayHello(new Employee("Widy"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Guilias"));

    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
