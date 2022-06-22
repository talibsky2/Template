public class Test {
    public static void main(String[] args) {
        CarFactory sedan = new Sedan();
        CarFactory coupe = new Coupe();
        sedan.createCar();
        coupe.createCar();
    }
}