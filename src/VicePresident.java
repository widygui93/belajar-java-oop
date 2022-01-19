class VicePresident extends Manager{

    VicePresident(String name){
        super(name);
        // wajib panggil construction di parent nya dengan kata kunci super
    }

    void sayHello(String name){
        System.out.println("Hello " + name + " My name is vice president " + this.name);
    }
}
