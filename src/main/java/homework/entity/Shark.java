package homework.entity;

import java.time.LocalDate;
import java.util.Random;

public class Shark extends Predator {

    public Shark(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    public static String getRandomBreed() {
        String[] breeds = new String[] {"Тигровая", "Белая", "Китовая", "Молот"};
        return breeds[new Random().nextInt(breeds.length - 1)];
    }
}