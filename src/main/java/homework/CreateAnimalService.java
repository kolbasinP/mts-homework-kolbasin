package homework;

import java.util.Random;

public interface CreateAnimalService {

    default void createAnimal() {
        System.out.println("default CreateAnimalService while");
        Animal animal = null;

        int count = 0;
        while (count < 10) {

            switch (new Random().nextInt(5)) {
                case 1:
                    animal = new Dog(Dog.getRandomBreed(), Dog.getRandomName(), Dog.getRandomCost(), Dog.getRandomCharacter());
                    break;
                case 2:
                    animal = new Cat(Cat.getRandomBreed(), Cat.getRandomName(), Cat.getRandomCost(), Cat.getRandomCharacter());
                    break;
                case 3:
                    animal = new Wolf(Wolf.getRandomBreed(), Wolf.getRandomName(), Wolf.getRandomCost(), Wolf.getRandomCharacter());
                    break;
                case 4:
                    animal = new Shark(Shark.getRandomBreed(), Shark.getRandomName(), Shark.getRandomCost(), Shark.getRandomCharacter());
                    break;
            }

            if (animal != null)
                System.out.println(animal.getBreed() + " " + animal.getName() + " " + animal.getCost() + " " + animal.getCharacter());
            count++;
        }
    }
}