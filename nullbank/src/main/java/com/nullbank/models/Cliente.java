package com.nullbank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codCliente;
    private String nome;
    private String cpf;

    public Cliente(int codCliente, String nome, String cpf) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente() {

    }

    public int getCodCliente() {
        return codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
