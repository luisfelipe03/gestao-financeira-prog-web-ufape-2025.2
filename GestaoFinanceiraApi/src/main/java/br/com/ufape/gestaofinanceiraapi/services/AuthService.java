package br.com.ufape.gestaofinanceiraapi.services;

import br.com.ufape.gestaofinanceiraapi.entities.UserEntity;

public interface AuthService {
    UserEntity register(UserEntity userEntity);
    UserEntity login(String email, String password);

    UserEntity findUserByEmail(String email);
}
