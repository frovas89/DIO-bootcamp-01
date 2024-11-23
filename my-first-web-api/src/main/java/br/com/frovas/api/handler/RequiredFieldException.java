package br.com.frovas.api.handler;

public class RequiredFieldException extends BusinessException{
    public RequiredFieldException(String field) {
        super("O campo %s é obrigatório", field);
    }
}
