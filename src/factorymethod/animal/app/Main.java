package factorymethod.animal.app;

import factorymethod.animal.factory.AnimalFactory;
import factorymethod.animal.factory.CatFactory;
import factorymethod.animal.factory.DogFactory;
import factorymethod.animal.model.Animal;

public class Main {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.speaks();

        AnimalFactory catAnimalFactory = new CatFactory();
        Animal cat = catAnimalFactory.createAnimal();
        cat.speaks();

    }
}
