package factorymethod.vehiclefactory.model;

public class Car implements Vehicle{
    @Override
    public void vehicleName() {
        System.out.println("Car");
    }
}
