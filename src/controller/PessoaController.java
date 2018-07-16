/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Pessoa;
import repositories.PessoaRepository;

/**
 *
 * @author itamir.filho
 */
public class PessoaController {
    
    private PessoaRepository pessoaRepository;
    
        
    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public void salvar(Pessoa pessoa) {
        pessoaRepository.addPessoa(pessoa);
    }
    
    public void remover(Pessoa pessoa) {
        pessoaRepository.removePessoa(pessoa);
    }
    
    public void atualizar(Pessoa pessoaOld, Pessoa pessoaNew){
        pessoaRepository.removePessoa(pessoaOld);
        pessoaRepository.addPessoa(pessoaNew);
    }
    
    public String listar() {
        String lista = "Lista de pessoas \n";
        for (Pessoa pessoa : pessoaRepository.listar()) {
            lista += pessoa + "\n";
        }
        return lista;
    }
}