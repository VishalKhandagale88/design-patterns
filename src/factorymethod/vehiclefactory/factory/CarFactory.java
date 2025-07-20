package factorymethod.vehiclefactory.factory;

import factorymethod.vehiclefactory.model.Car;
import factorymethod.vehiclefactory.model.Vehicle;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
