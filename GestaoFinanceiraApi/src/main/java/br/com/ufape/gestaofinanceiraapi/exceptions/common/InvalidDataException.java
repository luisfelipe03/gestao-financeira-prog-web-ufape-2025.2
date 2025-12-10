package br.com.ufape.gestaofinanceiraapi.exceptions.common;

public class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message) {
        super(message);
    }
}
