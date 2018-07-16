/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.util.ArrayList;
import java.util.List;
import model.ItemConta;

/**
 *
 * @author yargo.valerio
 */
public class ItemContaRepository {
    
    private final List<ItemConta> itencontas;
    
    public ItemContaRepository(){
        itencontas = new ArrayList<>();
    }
    
    public void addItemConta(ItemConta itemConta){
        itencontas.add(itemConta);
    }
    
    public void removeItemConta(ItemConta itemConta){
        itencontas.remove(itemConta);
    }
    
    public List<ItemConta> listar(){
        return itencontas;
    }
    
}
