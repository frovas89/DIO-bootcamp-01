package br.com.frovas;

import java.util.logging.Logger;

public class Database {

    private static final Logger LOGGER = Logger.getLogger(Database.class.getName());

    public static void startConnection() {
        LOGGER.info("Iniciou Conexão");
    }

    public static void endConnection() {
        LOGGER.info("Finalizou Conexão");
    }
}
