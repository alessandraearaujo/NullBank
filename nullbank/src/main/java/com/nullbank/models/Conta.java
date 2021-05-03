package com.nullbank.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Conta implements Serializable {

    // Atributos da classe mãe Conta
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codConta;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroConta;

    private int senha;

    @OneToOne
    private Cliente titular;

    private double saldo = 0;

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

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getCodConta() {
        return codConta;
    }

    public void setCodConta(int codConta) {
        this.codConta = codConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
