public class Coupe extends CarFactory{
    @Override
    void doors() {
        System.out.println("Set 3 doors...");
    }

    @Override
    void spoiler() {
        System.out.println("Set spoiler...");
    }
}
