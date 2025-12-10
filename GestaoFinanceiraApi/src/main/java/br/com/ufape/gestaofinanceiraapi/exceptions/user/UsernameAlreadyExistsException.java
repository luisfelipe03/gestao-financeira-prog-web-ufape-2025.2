package br.com.ufape.gestaofinanceiraapi.exceptions.user;

public class UsernameAlreadyExistsException extends RuntimeException {
    public UsernameAlreadyExistsException(String username) {
        super("Username " + username + " já cadastrado");
    }
}
