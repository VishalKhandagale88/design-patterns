package factorymethod.animalfactory.factory;

import factorymethod.animalfactory.model.Animal;
import factorymethod.animalfactory.model.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
