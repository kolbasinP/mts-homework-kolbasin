package homework.entity;

import java.time.LocalDate;

public class Predator extends AbstractAnimal {
    protected Predator(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}