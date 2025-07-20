package factorymethod.animal.factory;

import factorymethod.animal.model.Animal;
import factorymethod.animal.model.Cat;

public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
