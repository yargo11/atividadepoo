/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Item;
import repositories.ItemRepository;

/**
 *
 * @author itamir.filho
 */
public class ItemController {
    
    private ItemRepository itemRepository;
    
        
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void salvar(Item item) {
        itemRepository.addItem(item);
    }
    
    public void remover(Item item) {
        itemRepository.removeItem(item);
    }
    
    public void atualizar(Item itemOld, Item itemNew){
        itemRepository.removeItem(itemOld);
        itemRepository.addItem(itemNew);
    }
    
    public String listar() {
        String lista = "Lista de itens \n";
        for (Item item : itemRepository.listar()) {
            lista += item + "\n";
        }
        return lista;
    }
}
