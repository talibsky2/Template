abstract class CarFactory {
    void createCar(){
        System.out.println("Create car...");
        System.out.println("Set engine...");
        System.out.println("Set 4 wheels...");
        doors ();
        spoiler();
    }
    abstract void doors();
    abstract void spoiler();
}
