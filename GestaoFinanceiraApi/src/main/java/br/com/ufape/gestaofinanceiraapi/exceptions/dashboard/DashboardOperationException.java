package br.com.ufape.gestaofinanceiraapi.exceptions.dashboard;

public class DashboardOperationException extends RuntimeException {

    public DashboardOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
