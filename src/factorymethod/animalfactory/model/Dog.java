package factorymethod.animalfactory.model;

public class Dog implements Animal{
    @Override
    public void speaks() {
        System.out.println("BARKS");
    }
}
