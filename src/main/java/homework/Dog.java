package homework;

import java.util.Random;

public class Dog extends Pet {

    protected Dog(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    protected static String getRandomBreed() {
        String[] breeds = new String[] {"Хаски", "Овчарка", "Колли", "Такса"};
        return breeds[new Random().nextInt(breeds.length - 1)];
    }
}
