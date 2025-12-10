package br.com.ufape.gestaofinanceiraapi.repositories.custom;

import br.com.ufape.gestaofinanceiraapi.entities.CategoriaEntity;
import br.com.ufape.gestaofinanceiraapi.entities.OrcamentoMensalEntity;

import java.time.YearMonth;
import java.util.List;
import java.util.Optional;

public interface OrcamentoMensalRepositoryCustom {
    Optional<OrcamentoMensalEntity> findByCategoriaAndPeriodoAndUserUuid(CategoriaEntity categoria, YearMonth periodo, String userId);
    Optional<OrcamentoMensalEntity> findByUuidAndUserUuid(String uuid, String userId);
    List<OrcamentoMensalEntity> findByUserId(String userId);
    List<OrcamentoMensalEntity> findByPeriodo(YearMonth periodo);
}
