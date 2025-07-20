package factorymethod.animalfactory.app;

import factorymethod.animalfactory.factory.AnimalFactory;
import factorymethod.animalfactory.factory.CatFactory;
import factorymethod.animalfactory.factory.DogFactory;
import factorymethod.animalfactory.model.Animal;

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
