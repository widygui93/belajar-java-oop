class Manager extends Employee{
//    String name;

    String company;

    // jika di class parent ada constructor
    // maka wajib buat constructor di child ny utk manggil constructor di parent nya
    Manager(String name){
//        this.name = name;
        super(name);
    }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hello " + name + " My name is manager " + this.name);
    }
}
