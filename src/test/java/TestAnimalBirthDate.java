import homework.entity.Animal;
import homework.exceptions.InvalidAnimalBirthDateException;
import homework.exceptions.InvalidAnimalException;
import homework.servicesImpl.CreateAnimalServiceImpl;
import homework.servicesImpl.SearchServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import java.time.LocalDate;

import static homework.entity.AbstractAnimal.getLeapYearBirthDate;
import static homework.entity.AbstractAnimal.getNotLeapYearBirthDate;
import static org.junit.jupiter.api.Assertions.*;

public class TestAnimalBirthDate {

    SearchServiceImpl searchService = new SearchServiceImpl();
    CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();

    @Test
    @DisplayName("Положительный тест. Животное рождено в високосный год")
    public void successAnimalWithLeapYearBirthDate() throws InvalidAnimalBirthDateException {
        Animal animal = createAnimalService.createRandomAnimal();
        animal.setBirthDate(getLeapYearBirthDate());

        boolean result = searchService.checkLeapYearAnimal(animal);
        assertTrue(result);
    }

    @Test
    @DisplayName("Положительный тест. Животное не рождено в високосный год")
    public void successAnimalWithoutLeapYearBirthDate() throws InvalidAnimalBirthDateException {
        Animal animal = createAnimalService.createRandomAnimal();
        animal.setBirthDate(getNotLeapYearBirthDate());

        boolean result = searchService.checkLeapYearAnimal(animal);
        assertFalse(result);
    }

    @ParameterizedTest
    @DisplayName("Отрицательный тест. Поле birthDate = null")
    @NullSource
    public void failureAnimalWithBadBirthDate(LocalDate birthDate) {
        Animal animal = createAnimalService.createRandomAnimal();
        animal.setBirthDate(birthDate);
        assertThrows(InvalidAnimalBirthDateException.class, () -> searchService.checkLeapYearAnimal(animal));
    }

    @Test
    @DisplayName("Отрицательный тест. Передать null вместо животного")
    public void failureAnimalWithBadAnimal() {
        assertThrows(InvalidAnimalException.class, () -> searchService.checkLeapYearAnimal(null));
    }
}