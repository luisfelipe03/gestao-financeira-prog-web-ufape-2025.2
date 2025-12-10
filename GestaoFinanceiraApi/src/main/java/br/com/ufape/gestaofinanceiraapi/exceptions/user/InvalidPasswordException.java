package br.com.ufape.gestaofinanceiraapi.exceptions.user;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException() {
        super("Senha inválida");
    }
}
