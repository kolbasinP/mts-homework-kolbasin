package homework;

import java.util.Random;

public class Cat extends Pet {

    protected Cat(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    protected static String getRandomBreed() {
        String[] breeds = new String[] {"Дворовая", "Сиамская", "Персидская", "Британская"};
        return breeds[new Random().nextInt(breeds.length - 1)];
    }
}
