package br.com.ufape.gestaofinanceiraapi.exceptions.receita;

public class ReceitaOperationException extends RuntimeException {
    public ReceitaOperationException(String message) {
        super(message);
    }

    public ReceitaOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
