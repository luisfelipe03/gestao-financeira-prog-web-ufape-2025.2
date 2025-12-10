package br.com.ufape.gestaofinanceiraapi.exceptions.common;

public class InvalidUuidException extends RuntimeException {
    public InvalidUuidException() {
        super("O UUID não pode ser nulo ou vazio");
    }
}
