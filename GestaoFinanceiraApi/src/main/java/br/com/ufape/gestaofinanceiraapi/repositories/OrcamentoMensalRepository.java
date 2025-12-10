package br.com.ufape.gestaofinanceiraapi.repositories;

import br.com.ufape.gestaofinanceiraapi.entities.OrcamentoMensalEntity;
import br.com.ufape.gestaofinanceiraapi.repositories.custom.OrcamentoMensalRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoMensalRepository extends JpaRepository<OrcamentoMensalEntity, String>, OrcamentoMensalRepositoryCustom {

}
