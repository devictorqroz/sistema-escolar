package com.devictor.sistemaescolar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailComEnderecoInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido"));
    }

    @Test
    void deveriaPermitirCriarEmailComEnderecoValido() {
        String endereco = "contato@email.com";
        Email email = new Email(endereco);
        assertEquals(endereco, email.getEndereco());
    }
}