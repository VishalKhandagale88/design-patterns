package factorymethod.animal.model;

public class Cat implements Animal{

    @Override
    public void speaks() {
        System.out.println("MEOW");
    }
}
