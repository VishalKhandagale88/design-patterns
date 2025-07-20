package factorymethod.vehicle.app;

import factorymethod.vehicle.factory.BusFactory;
import factorymethod.vehicle.factory.CarFactory;
import factorymethod.vehicle.factory.VehicleFactory;
import factorymethod.vehicle.model.Vehicle;

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
