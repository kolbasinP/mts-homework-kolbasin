package homework.servicesImpl;

import homework.entity.*;
import homework.exceptions.InvalidAnimalBirthDateException;
import homework.services.CreateAnimalService;

import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    public Animal createRandomAnimal() {
        Animal animal = null;

        switch (new Random().nextInt(5)) {
            case 1:
                animal = new Dog(Dog.getRandomBreed(),
                        Dog.getRandomName(),
                        Dog.getRandomCost(),
                        Dog.getRandomCharacter(),
                        Dog.getRandomBirthDate());
                break;
            case 2:
                animal = new Cat(Cat.getRandomBreed(),
                        Cat.getRandomName(),
                        Cat.getRandomCost(),
                        Cat.getRandomCharacter(),
                        Cat.getRandomBirthDate());
                break;
            case 3:
                animal = new Wolf(Wolf.getRandomBreed(),
                        Wolf.getRandomName(),
                        Wolf.getRandomCost(),
                        Wolf.getRandomCharacter(),
                        Wolf.getRandomBirthDate());
                break;
            case 4:
                animal = new Shark(Shark.getRandomBreed(),
                        Shark.getRandomName(),
                        Shark.getRandomCost(),
                        Shark.getRandomCharacter(),
                        Shark.getRandomBirthDate());
                break;
        }

        return animal;
    }

    public void createAnimal(int count) {
        System.out.println("CreateAnimalServiceImpl for");
        Animal animal = null;
        SearchServiceImpl searchService = new SearchServiceImpl();

        for (int i = 0; i < count; i++) {

            switch (new Random().nextInt(5)) {
                case 1:
                    animal = new Dog(Dog.getRandomBreed(),
                            Dog.getRandomName(),
                            Dog.getRandomCost(),
                            Dog.getRandomCharacter(),
                            Dog.getRandomBirthDate());
                    break;
                case 2:
                    animal = new Cat(Cat.getRandomBreed(),
                            Cat.getRandomName(),
                            Cat.getRandomCost(),
                            Cat.getRandomCharacter(),
                            Cat.getRandomBirthDate());
                    break;
                case 3:
                    animal = new Wolf(Wolf.getRandomBreed(),
                            Wolf.getRandomName(),
                            Wolf.getRandomCost(),
                            Wolf.getRandomCharacter(),
                            Wolf.getRandomBirthDate());
                    break;
                case 4:
                    animal = new Shark(Shark.getRandomBreed(),
                            Shark.getRandomName(),
                            Shark.getRandomCost(),
                            Shark.getRandomCharacter(),
                            Shark.getRandomBirthDate());
                    break;
            }

            if (animal != null) {
                System.out.println(animal.getBreed() + " " + animal.getName() + " " + animal.getCost() + " " + animal.getCharacter() + " " + animal.getBirthDate());

                try {
                    searchService.checkLeapYearAnimal(animal);
                } catch (InvalidAnimalBirthDateException e) {
                    throw new RuntimeException("“Работа метода завершилась ошибкой" + e.getMessage());
                }
            }
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
                    animal = new Dog(Dog.getRandomBreed(),
                            Dog.getRandomName(),
                            Dog.getRandomCost(),
                            Dog.getRandomCharacter(),
                            Dog.getRandomBirthDate());
                    break;
                case 2:
                    animal = new Cat(Cat.getRandomBreed(),
                            Cat.getRandomName(),
                            Cat.getRandomCost(),
                            Cat.getRandomCharacter(),
                            Cat.getRandomBirthDate());
                    break;
                case 3:
                    animal = new Wolf(Wolf.getRandomBreed(),
                            Wolf.getRandomName(),
                            Wolf.getRandomCost(),
                            Wolf.getRandomCharacter(),
                            Wolf.getRandomBirthDate());
                    break;
                case 4:
                    animal = new Shark(Shark.getRandomBreed(),
                            Shark.getRandomName(),
                            Shark.getRandomCost(),
                            Shark.getRandomCharacter(),
                            Shark.getRandomBirthDate());
                    break;
            }

            if (animal != null)
                System.out.println(animal.getBreed() + " " + animal.getName() + " " + animal.getCost() + " " + animal.getCharacter() + " " + animal.getBirthDate());
            count++;
        } while (count < 10);
    }
}
