package br.com.ufape.gestaofinanceiraapi.dto.receita;

import br.com.ufape.gestaofinanceiraapi.dto.common.TransacaoDTO;
import jakarta.validation.constraints.NotBlank;

public class ReceitaDTO extends TransacaoDTO {
    @NotBlank(message = "A origem do pagamento é obrigatória.")
    private String origemDoPagamento;

    // Getters and Setters

    public String getOrigemDoPagamento() {
        return origemDoPagamento;
    }

    public void setOrigemDoPagamento(String origemDoPagamento) {
        this.origemDoPagamento = origemDoPagamento;
    }
}