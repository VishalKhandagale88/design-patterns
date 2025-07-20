package factorymethod.vehicle.factory;

import factorymethod.vehicle.model.Bus;
import factorymethod.vehicle.model.Vehicle;

public class BusFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bus();
    }
}
