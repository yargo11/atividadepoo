/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Conta;
import repositories.ContaRepository;

/**
 *
 * @author itamir.filho
 */
public class ContaController {
    
    private ContaRepository contaRepository;
    
        
    public ContaController(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public void salvar(Conta conta) {
        contaRepository.addConta(conta);
    }
    
    public void remover(Conta conta) {
        contaRepository.removeConta(conta);
    }
    
    public void atualizar(Conta contaOld, Conta contaNew){
        contaRepository.removeConta(contaOld);
        contaRepository.addConta(contaNew);
    }
    
    public String listar() {
        String lista = "Lista de contas \n";
        for (Conta conta : contaRepository.listar()) {
            lista += conta + "\n";
        }
        return lista;
    }
}