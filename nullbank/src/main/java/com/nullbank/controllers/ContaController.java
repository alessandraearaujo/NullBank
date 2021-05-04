package com.nullbank.controllers;

import com.nullbank.models.Cliente;
import com.nullbank.models.Conta;
import com.nullbank.repository.ClienteRepository;
import com.nullbank.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContaController {

    // Faz a injeção de dependências, criando uma nova instância da classe
    @Autowired
    private ContaRepository con;

    @Autowired
    private ClienteRepository cli;


    // Requisição que retorna o formulário
    @RequestMapping(value="/cadastrarConta", method=RequestMethod.GET)
    public String form() {

        return "formConta";
    }

    @RequestMapping(value = "/cadastrarContaEmpresa", method = RequestMethod.GET)
    public String formEmpresa() {
        return "formContaEmpresa";
    }

    // Requisição que envia dados, salvando-os no banco de dados utilizando o crud extends da interface
    @RequestMapping(value="/cadastrarConta", method=RequestMethod.POST)
    public String form(Conta conta) {
        conta.setTitular(new Cliente());
        con.save(conta);
        return "redirect:/cadastrarConta";
    }

    // Requisição exibe clientes cadastrados na view listarContas
    @RequestMapping(value="/listarContas")
    public ModelAndView listarContas() {
        ModelAndView mv = new ModelAndView("listarContas");
        Iterable<Conta> conta = con.findAll();
        // Reconhece a palavra "Contas" da view e instancia o objeto model view retornar cada um dos registros
        mv.addObject("contas",conta);
        return mv;
    }

    // Requisição exibe clientes cadastrados na view listarContas
    @RequestMapping(value="/listarContasEmpresa")
    public ModelAndView listarContasPJ() {
        ModelAndView mv = new ModelAndView("listarContasEmpresa");
        Iterable<Conta> conta = con.findAll();
        // Reconhece a palavra "Contas" da view e instancia o objeto model view retornar cada um dos registros
        mv.addObject("contas",conta);
        return mv;

    }


}
