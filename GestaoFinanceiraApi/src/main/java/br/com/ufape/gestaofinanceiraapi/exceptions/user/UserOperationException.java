package br.com.ufape.gestaofinanceiraapi.exceptions.user;

public class UserOperationException extends RuntimeException {
    public UserOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
