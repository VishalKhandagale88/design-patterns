package factorymethod.vehicle.factory;

import factorymethod.vehicle.model.Car;
import factorymethod.vehicle.model.Vehicle;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
