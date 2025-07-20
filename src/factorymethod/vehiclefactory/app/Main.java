package factorymethod.vehiclefactory.app;

import factorymethod.vehiclefactory.factory.BusFactory;
import factorymethod.vehiclefactory.factory.CarFactory;
import factorymethod.vehiclefactory.factory.VehicleFactory;
import factorymethod.vehiclefactory.model.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carVehicle = new CarFactory();
        Vehicle car = carVehicle.createVehicle();
        car.vehicleName();

        VehicleFactory busFactory = new BusFactory();
        Vehicle bus = busFactory.createVehicle();
        bus.vehicleName();

    }
}
