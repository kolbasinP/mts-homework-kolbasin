package homework.servicesImpl;

import homework.entity.Animal;
import homework.exceptions.*;
import homework.services.SearchService;

import java.time.LocalDate;
import java.util.Objects;

public class SearchServiceImpl implements SearchService {

    @Override
    public boolean checkLeapYearAnimal(Animal animal) throws InvalidAnimalBirthDateException {

        if (Objects.isNull(animal)) {
            throw new InvalidAnimalException("На вход пришел некорректный объект животного");
        }

        LocalDate animalBirthDate = animal.getBirthDate();
        String message;

        if (Objects.isNull(animalBirthDate)) {
            message = String.format("У животного %s не указана дата его рождения", animal.getClass());
            System.out.println(message);
            throw new InvalidAnimalBirthDateException(message);
        } else if (animalBirthDate.isLeapYear()) {
            message = String.format("%s был рожден в високосный год", animal.getName());
            System.out.println(message);
        } else {
            message = String.format("%s не был рожден в високосный год", animal.getName());
            System.out.println(message);
        }

        return animalBirthDate.isLeapYear();
    }
}
