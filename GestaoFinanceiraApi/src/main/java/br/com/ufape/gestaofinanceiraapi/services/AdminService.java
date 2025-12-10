package br.com.ufape.gestaofinanceiraapi.services;

import br.com.ufape.gestaofinanceiraapi.dto.user.UserAdminUpdateDTO;
import br.com.ufape.gestaofinanceiraapi.entities.UserEntity;

import java.util.List;

public interface AdminService {
    List<UserEntity> listUsers();

    UserEntity atualizarUser(String userID, UserAdminUpdateDTO userAdminUpdateDTO);
}
