package homework.entity;

import java.time.LocalDate;
import java.util.Random;

public class Dog extends Pet {

    public Dog(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    public static String getRandomBreed() {
        String[] breeds = new String[] {"Хаски", "Овчарка", "Колли", "Такса"};
        return breeds[new Random().nextInt(breeds.length - 1)];
    }
}