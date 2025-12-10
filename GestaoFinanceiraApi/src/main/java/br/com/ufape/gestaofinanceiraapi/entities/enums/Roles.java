package br.com.ufape.gestaofinanceiraapi.entities.enums;

public enum Roles {

    ADMIN,
    USER;

    @Override
    public String toString() {
        return this.name();
    }

}