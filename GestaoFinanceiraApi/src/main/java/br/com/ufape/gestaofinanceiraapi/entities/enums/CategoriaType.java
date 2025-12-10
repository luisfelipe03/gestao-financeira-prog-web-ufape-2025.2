package br.com.ufape.gestaofinanceiraapi.entities.enums;

public enum CategoriaType {
    RECEITAS,
    DESPESAS;

    @Override
    public String toString() {
        return this.name();
    }
}
