package factorymethod.animalfactory.factory;

import factorymethod.animalfactory.model.Animal;
import factorymethod.animalfactory.model.Cat;

public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
