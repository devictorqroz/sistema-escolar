package com.devictor.sistemaescolar.aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("ddd e numero são obrigatórios");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("ddd inválido");
        }

        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("número inválido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getDdd() {
        return this.ddd;
    }
}
