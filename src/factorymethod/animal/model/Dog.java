package factorymethod.animal.model;

public class Dog implements Animal{
    @Override
    public void speaks() {
        System.out.println("BARKS");
    }
}
