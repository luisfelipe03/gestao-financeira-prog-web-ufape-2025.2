package br.com.ufape.gestaofinanceiraapi.exceptions.user;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String uuid) {
        super("Usuário com UUID " + uuid + " não encontrada");
    }
}
