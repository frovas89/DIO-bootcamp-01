package br.com.frovas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void validateEntries() {
        int[] firstEntry = {10,20,30,40,50};
        int[] secondEntry = {10,20,30,40,50};

        assertArrayEquals(firstEntry, secondEntry);
    }

    @Test
    void validateIfObjectIsNull() {
        Person person = null;

        assertNull(person);

        person = new Person("Pessoa" , LocalDate.now());

        assertNotNull(person);
    }

    @Test
    void validateNumbersOfDifferentTypes() {
        double v1 = 5.0;
        double v2 =  5.0;

        assertEquals(v1, v2);

    }
}
