package homework.entity;

import java.time.LocalDate;
import java.util.Random;

public class Cat extends Pet {

    public Cat(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    public static String getRandomBreed() {
        String[] breeds = new String[] {"Дворовая", "Сиамская", "Персидская", "Британская"};
        return breeds[new Random().nextInt(breeds.length - 1)];
    }
}
