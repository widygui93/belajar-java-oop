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
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident)employee;
            System.out.println("Hello Vice President " + vicePresident.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager)employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
