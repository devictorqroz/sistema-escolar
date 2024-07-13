package com.devictor.sistemaescolar.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
    }

    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("88", null));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("88", ""));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("88", "123"));
    }

    @Test
    void deveriaPermitirCriarTelefoneComDDDENumeroValidos() {
        String ddd = "88";
        String numero = "123456789";
        Telefone telefone = new Telefone(ddd, numero);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }

}