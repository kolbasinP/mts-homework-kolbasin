package homework.entity;

import java.time.LocalDate;
import java.util.Random;

public class Wolf extends Predator {

    public Wolf(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    public static String getRandomBreed() {
        String[] breeds = new String[] {"Серый", "Красный", "Гривистый", "Японский"};
        return breeds[new Random().nextInt(breeds.length - 1)];
    }
}