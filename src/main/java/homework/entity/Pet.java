package homework.entity;

import java.time.LocalDate;

public class Pet extends AbstractAnimal {
    protected Pet(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}
