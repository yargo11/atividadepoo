/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.util.ArrayList;
import java.util.List;
import model.Pessoa;

/**
 *
 * @author yargo.valerio
 */
public class PessoaRepository {
    
     private final List<Pessoa> pessoas;
    
    public PessoaRepository(){
        pessoas = new ArrayList<>();
    }
    
    public void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    
    public void removePessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }
    
    public List<Pessoa> listar(){
        return pessoas;
    }
}
