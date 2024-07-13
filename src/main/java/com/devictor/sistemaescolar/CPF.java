package com.devictor.sistemaescolar;

public class CPF {

    // Value Object

    private String numero;

    private CPF(String numero) {
        if (numero == null ||
            !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.numero = numero;
    }

}
