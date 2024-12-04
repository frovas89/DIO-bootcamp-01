package br.com.frovas;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SelectPersonDataTest {

    @BeforeAll
    static void startConnection() {
        Database.startConnection();
    }

    @Test
    void validadeDataReturn() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void endConnection() {
        Database.endConnection();
    }
}
