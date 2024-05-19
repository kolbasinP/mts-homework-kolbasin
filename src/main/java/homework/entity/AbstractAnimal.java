package homework.entity;

import java.time.LocalDate;
import java.util.Random;

public class AbstractAnimal implements Animal {

    protected String breed; //порода
    protected String name; //имя
    protected Double cost; //цена
    protected String character; //характер
    protected LocalDate birthDate; //дата рождения

    protected AbstractAnimal(String breed, String name, Double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
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

    @Override
    public LocalDate getBirthDate() { return birthDate; }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public static String getRandomName() {
        String[] names = new String[] {"Мурка", "Барсик", "Васька", "Бакс", "Рекс", "Фокс", "Лайла", "Туська", "Акела", "Балто", "Лапище", "Гроза"};
        return names[new Random().nextInt(names.length - 1)];
    }

    public static double getRandomCost() {
        return new Random().nextDouble() * 1000;
    }

    public static String getRandomCharacter() {
        String[] characters = new String[] {"Добрый", "Ласковый", "Злой", "Спокойный"};
        return characters[new Random().nextInt(characters.length - 1)];
    }

    public static LocalDate getRandomBirthDate() {

        LocalDate birthDate = LocalDate.now();
        birthDate = birthDate.minusYears(new Random().nextInt(100));

        return birthDate;
    }

    public static LocalDate getLeapYearBirthDate() {
        LocalDate currentDate = LocalDate.now();

        while (!currentDate.isLeapYear()) {
            currentDate = currentDate.minusYears(1);
        }

        return currentDate;
    }

    public static LocalDate getNotLeapYearBirthDate() {
        LocalDate currentDate = LocalDate.now();

        while (currentDate.isLeapYear()) {
            currentDate = currentDate.minusYears(1);
        }

        return currentDate;
    }
}