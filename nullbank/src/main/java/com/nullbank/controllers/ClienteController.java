package com.nullbank.controllers;

import com.nullbank.models.Cliente;
import com.nullbank.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {

    // Faz a injeção de dependências, criando uma nova instância da classe
    @Autowired
    private ClienteRepository cli;


    // Requisição que retorna o formulário
    @RequestMapping(value="/cadastrarCliente", method=RequestMethod.GET)
    public String form() {
        return "formCliente";
    }

    // Requesição que envia dados, salvando-os no banco de dados utilizando o crud extends da interface
    @RequestMapping(value="/cadastrarCliente", method=RequestMethod.POST)
    public String form(Cliente cliente) {
        // Salva o cliente no banco de dados
        cli.save(cliente);
        return "redirect:/cadastrarCliente";
    }

    // Requisição exibe clientes cadastrados na view listarClientes
    @RequestMapping(value="/listarClientes")
    public ModelAndView listarClientes() {
        ModelAndView mv = new ModelAndView("listarClientes");
        Iterable<Cliente> clientes = cli.findAll();
        // Reconhece a palavra "clientes" da view e instancia o objeto model view retornar cada um dos registros
        mv.addObject("clientes",clientes);
        return mv;
    }

    // Requisição recebe um código de cliente, retorna o registro e o exclui
    @RequestMapping("/deletarCliente")
    public String deletarCliente(int codCliente){
        Cliente cliente = cli.findClienteByCodCliente(codCliente);
        cli.delete(cliente);
        return "redirect:/listarClientes";
    }

}



