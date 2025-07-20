package factorymethod.vehiclefactory.factory;

import factorymethod.vehiclefactory.model.Bus;
import factorymethod.vehiclefactory.model.Vehicle;

public class BusFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bus();
    }
}
