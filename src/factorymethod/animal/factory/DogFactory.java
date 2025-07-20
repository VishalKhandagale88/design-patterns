package factorymethod.animal.factory;

import factorymethod.animal.model.Animal;
import factorymethod.animal.model.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
