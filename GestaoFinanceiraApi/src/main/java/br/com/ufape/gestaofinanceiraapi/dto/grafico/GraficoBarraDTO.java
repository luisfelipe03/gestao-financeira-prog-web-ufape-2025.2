package br.com.ufape.gestaofinanceiraapi.dto.grafico;

import java.math.BigDecimal;
import java.util.Map;

public record GraficoBarraDTO(Map<String , BigDecimal> dadosMensais) {}
