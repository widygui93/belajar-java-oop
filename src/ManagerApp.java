class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Budi");
//        manager.name = "Budi";
        manager.sayHello("Andi");

        var vicePresident = new VicePresident("Anto");
//        vicePresident.name = "Anto";
        vicePresident.sayHello("Tomo");

        System.out.println(manager);
        System.out.println(manager.toString());
    }
}
