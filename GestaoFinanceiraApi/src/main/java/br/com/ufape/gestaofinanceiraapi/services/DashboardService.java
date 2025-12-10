package br.com.ufape.gestaofinanceiraapi.services;

import br.com.ufape.gestaofinanceiraapi.entities.DespesaEntity;
import br.com.ufape.gestaofinanceiraapi.entities.ReceitaEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.Map;

@Service
public interface DashboardService {

    BigDecimal getSaldoTotal(String userId, YearMonth yearMonth);
    DespesaEntity getMaiorDespesa(String userId, YearMonth yearMonth);
    ReceitaEntity getMaiorReceita(String userId, YearMonth yearMonth);
    Map<String, BigDecimal> getCategoriaComMaiorDespesa(String userId, YearMonth yearMonth);
    Map<String, BigDecimal> getCategoriaComMaiorReceita(String userId, YearMonth yearMonth);
    BigDecimal calcularTotalDespesasNoMes(String userId, YearMonth mes);
    BigDecimal calcularTotalReceitasNoMes(String userId, YearMonth mes);
}
