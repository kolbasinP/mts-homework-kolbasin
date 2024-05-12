package homework;

import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    public void createAnimal(int count) {
        System.out.println("CreateAnimalServiceImpl for");
        Animal animal = null;

        for (int i = 0; i < count; i++) {

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
        }
    }

    @Override
    public void createAnimal() {
        System.out.println("CreateAnimalServiceImpl do - while");
        Animal animal = null;

        int count = 0;
        do {

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
        } while (count < 10);
    }
}
