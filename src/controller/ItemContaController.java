/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.ItemConta;
import repositories.ItemContaRepository;

/**
 *
 * @author itamir.filho
 */
public class ItemContaController {
    
    private ItemContaRepository itemcontaRepository;
    
        
    public ItemContaController(ItemContaRepository itemcontaRepository) {
        this.itemcontaRepository = itemcontaRepository;
    }

    public void salvar(ItemConta itemconta) {
        itemcontaRepository.addItemConta(itemconta);
    }
    
    public void remover(ItemConta itemconta) {
        itemcontaRepository.removeItemConta(itemconta);
    }
    
    public void atualizar(ItemConta itemcontaOld, ItemConta itemcontaNew){
        itemcontaRepository.removeItemConta(itemcontaOld);
        itemcontaRepository.addItemConta(itemcontaNew);
    }
    
    public String listar() {
        String lista = "Lista de itemcontas \n";
        for (ItemConta itemconta : itemcontaRepository.listar()) {
            lista += itemconta + "\n";
        }
        return lista;
    }
}