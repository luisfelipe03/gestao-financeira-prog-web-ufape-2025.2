package br.com.ufape.gestaofinanceiraapi.repositories;

import br.com.ufape.gestaofinanceiraapi.entities.CategoriaEntity;
import br.com.ufape.gestaofinanceiraapi.entities.DespesaEntity;
import br.com.ufape.gestaofinanceiraapi.repositories.custom.DespesaRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DespesaRepository extends JpaRepository<DespesaEntity, String>, DespesaRepositoryCustom {
    List<DespesaEntity> findAllByUserUuid(String userId);

    List<DespesaEntity> findAllByCategoria(CategoriaEntity categoria);
}
