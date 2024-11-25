package br.com.frovas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonTest {

    @Test
    void validateAgeCalc() {
        Person person = new Person("Frovas", LocalDate.of(1989, 3, 24));
        Assertions.assertEquals(35, person.getAge());
    }
}
