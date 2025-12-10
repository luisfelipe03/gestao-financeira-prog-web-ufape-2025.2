package br.com.ufape.gestaofinanceiraapi.exceptions.categoria;

public class CategoriaAlreadyExistsException extends RuntimeException {
    public CategoriaAlreadyExistsException(String nome) {
        super("Categoria " + nome + " já cadastrada");
    }
}
