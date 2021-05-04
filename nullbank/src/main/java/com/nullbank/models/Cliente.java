package com.nullbank.models;

import org.springframework.lang.NonNull;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Cliente implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codCliente;

    @NonNull
    private String nome;

    @NonNull
    private String cpf;
    public Cliente(int codCliente, String nome, String cpf) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public Cliente() {

    }

    public int getCodCliente() {return codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String s, String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void setCodCliente(String codCliente, int codCliente1) {
    }
}
