package br.com.ufape.gestaofinanceiraapi.repositories;

import br.com.ufape.gestaofinanceiraapi.entities.CategoriaEntity;
import br.com.ufape.gestaofinanceiraapi.entities.ReceitaEntity;
import br.com.ufape.gestaofinanceiraapi.repositories.custom.ReceitaRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReceitaRepository extends JpaRepository<ReceitaEntity, String>, ReceitaRepositoryCustom {
    List<ReceitaEntity> findAllByUserUuid(String userId);

    List<ReceitaEntity> findAllByCategoria(CategoriaEntity categoria);
}
