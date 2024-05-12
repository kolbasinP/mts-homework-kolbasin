package homework;

import java.util.Random;

public class Wolf extends Predator{

    protected Wolf(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    protected static String getRandomBreed() {
        String[] breeds = new String[] {"Серый", "Красный", "Гривистый", "Японский"};
        return breeds[new Random().nextInt(breeds.length - 1)];
    }
}