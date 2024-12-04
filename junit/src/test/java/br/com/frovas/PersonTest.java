package br.com.frovas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonTest {

    @Test
    void shouldReturnCorrectAge() {
        Person frovas = new Person("Frovas", LocalDate.of(1989, 3, 24));
        Assertions.assertEquals(35, frovas.getAge());
    }

    @Test
    void shouldReturnIfIsOfLegalAge() {
        Person frovas = new Person("Frovas", LocalDate.of(1989, 3, 24));
        Assertions.assertTrue(frovas.isOfLegalAge());

        Person joao = new Person("Joao", LocalDate.now());
        Assertions.assertFalse(joao.isOfLegalAge());
    }
}
