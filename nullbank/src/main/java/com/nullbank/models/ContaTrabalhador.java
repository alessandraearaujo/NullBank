package com.nullbank.models;

import javax.persistence.Entity;

@Entity
public class ContaTrabalhador extends Conta {
    private final static double limiteChequeEspecial = 100; // Não deve ser alterado

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

}