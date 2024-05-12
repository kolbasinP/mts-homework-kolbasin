package homework;

import java.util.Random;

public class AbstractAnimal implements Animal{

    protected String breed; //порода
    protected String name; //имя
    protected Double cost; //цена
    protected String character; //характер

    protected AbstractAnimal(String breed, String name, Double cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    protected static String getRandomName() {
        String[] names = new String[] {"Мурка", "Барсик", "Васька", "Бакс", "Рекс", "Фокс", "Лайла", "Туська", "Акела", "Балто", "Лапище", "Гроза"};
        return names[new Random().nextInt(names.length - 1)];
    }

    protected static double getRandomCost() {
        return new Random().nextDouble() * 1000;
    }

    protected static String getRandomCharacter() {
        String[] characters = new String[] {"Добрый", "Ласковый", "Злой", "Спокойный"};
        return characters[new Random().nextInt(characters.length - 1)];
    }
}