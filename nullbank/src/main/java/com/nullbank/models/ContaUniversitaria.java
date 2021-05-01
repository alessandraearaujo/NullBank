package com.nullbank.models;

import javax.persistence.Entity;

@Entity
public class ContaUniversitaria extends ContaTrabalhador {

    private final static double limiteChequeEspecial = 500; // Não deve ser alterado
    private int situacaoMatricula;
    private String dataComprovacaoMatricula;

    public int getSituacaoMatricula() {
        return situacaoMatricula;
    }

    public void setSituacaoMatricula(int situacaoMatricula) {
        this.situacaoMatricula = situacaoMatricula;
    }

    public String getDataComprovacaoMatricula() {
        return dataComprovacaoMatricula;
    }

    public void setDataComprovacaoMatricula(String dataComprovacaoMatricula) {
        this.dataComprovacaoMatricula = dataComprovacaoMatricula;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

}