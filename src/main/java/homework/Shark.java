package homework;

import java.util.Random;

public class Shark extends Predator {

    protected Shark(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    protected static String getRandomBreed() {
        String[] breeds = new String[] {"Тигровая", "Белая", "Китовая", "Молот"};
        return breeds[new Random().nextInt(breeds.length - 1)];
    }
}
