package br.com.ufape.gestaofinanceiraapi.exceptions.despesa;

public class DespesaOperationException extends RuntimeException {
    public DespesaOperationException(String message) {
        super(message);
    }

    public DespesaOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
