package homework.services;

import homework.entity.Animal;
import homework.exceptions.InvalidAnimalBirthDateException;

public interface SearchService {

    boolean checkLeapYearAnimal(Animal animal) throws InvalidAnimalBirthDateException;
}
