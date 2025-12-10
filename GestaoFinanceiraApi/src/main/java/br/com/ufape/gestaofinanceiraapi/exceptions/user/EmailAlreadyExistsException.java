package br.com.ufape.gestaofinanceiraapi.exceptions.user;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException(String email) {
        super("Email " + email + " já cadastrado");
    }
}
