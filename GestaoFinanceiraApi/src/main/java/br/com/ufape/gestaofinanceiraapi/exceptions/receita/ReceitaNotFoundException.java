package br.com.ufape.gestaofinanceiraapi.exceptions.receita;

public class ReceitaNotFoundException extends RuntimeException {
    public ReceitaNotFoundException(String uuid) {
        super("Nenhuma receita encontrada para o usuário de ID: " + uuid + ".");
    }

}