package com.nullbank.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Conta implements Serializable {

    // Atributos da classe mãe Conta
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroConta;
    private int senha;
    private double saldo = 0;
//    @PrimaryKeyJoinColumn
//    private Cliente titular;

    public Conta() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
