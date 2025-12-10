package br.com.ufape.gestaofinanceiraapi.services;

import br.com.ufape.gestaofinanceiraapi.dto.grafico.GraficoBarraDTO;
import br.com.ufape.gestaofinanceiraapi.dto.grafico.GraficoPizzaDTO;
import br.com.ufape.gestaofinanceiraapi.dto.receita.ReceitaCreateDTO;
import br.com.ufape.gestaofinanceiraapi.dto.receita.ReceitaUpdateDTO;
import br.com.ufape.gestaofinanceiraapi.entities.ReceitaEntity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

public interface ReceitaService {
    ReceitaEntity criarReceita(ReceitaCreateDTO receitaCreateDTO, String userId);

    List<ReceitaEntity> listarReceitasUsuario(String userId);

    ReceitaEntity buscarReceitaPorId(String uuid);

    ReceitaEntity atualizarReceita(String uuid, ReceitaUpdateDTO receitaUpdateDTO);

    void excluirReceita(String uuid);

    GraficoPizzaDTO gerarGraficoPizza(String userId, LocalDate inicio, LocalDate fim);

    GraficoBarraDTO gerarGraficoBarras(String userId, YearMonth inicio, YearMonth fim);

    List<ReceitaEntity> buscarReceitasPorIntervaloDeDatas(String userId, LocalDate inicio, LocalDate fim);

    List<ReceitaEntity> buscarReceitasPorIntervaloDeValores(String userId, BigDecimal min, BigDecimal max);
}
