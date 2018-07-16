/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Cliente;
import repositories.ClienteRepository;

/**
 *
 * @author itamir.filho
 */
public class ClienteController {
    
    private ClienteRepository clienteRepository;
    
        
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void salvar(Cliente cliente) {
        clienteRepository.addCliente(cliente);
    }
    
    public void remover(Cliente cliente) {
        clienteRepository.removeCliente(cliente);
    }
    
    public void atualizar(Cliente clienteOld, Cliente clienteNew){
        clienteRepository.removeCliente(clienteOld);
        clienteRepository.addCliente(clienteNew);
    }
    
    public String listar() {
        String lista = "Lista de cliente \n";
        for (Cliente cliente : clienteRepository.listar()) {
            lista += cliente + "\n";
        }
        return lista;
    }
}