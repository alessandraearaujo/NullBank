package com.nullbank.controllers;

import com.nullbank.models.Conta;
import com.nullbank.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContaController {

    // Faz a injeção de dependências, criando uma nova instância da classe
    @Autowired
    private ContaRepository con;

    // Requisição que retorna o formulário
    @RequestMapping(value="/cadastrarConta", method=RequestMethod.GET)
    public String form() {

        return "conta/formConta";
    }

    // Requisição que envia dados, salvando-os no banco de dados utilizando o crud extends da interface
    @RequestMapping(value="/cadastrarConta", method=RequestMethod.POST)
    public String form(Conta conta) {
        System.out.println(conta.toString());
        // Salva a conta no banco de dados
        con.save(conta);

        return "redirect:/cadastrarConta";
    }
}
