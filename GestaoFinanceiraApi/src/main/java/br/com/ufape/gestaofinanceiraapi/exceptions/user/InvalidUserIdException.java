package br.com.ufape.gestaofinanceiraapi.exceptions.user;

public class InvalidUserIdException extends RuntimeException {
    public InvalidUserIdException() {
        super("O userId não pode ser nulo ou vazio");
    }
}
