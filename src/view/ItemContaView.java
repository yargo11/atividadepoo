/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemContaController;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Conta;
import model.Item;
import model.ItemConta;
import repositories.ItemContaRepository;

/**
 *
 * @author itamir.filho
 */
public class ItemContaView {
    
    private ItemContaController itemcontaController;
    
    private ItemContaRepository itemcontaRepository;
    
    public ItemContaView() {
        itemcontaRepository = new ItemContaRepository();
        itemcontaController = new ItemContaController(itemcontaRepository);
    }

    public ItemContaController getItemContaController() {
        return itemcontaController;
    }

    public void setItemContaController(ItemContaController itemcontaController) {
        this.itemcontaController = itemcontaController;
    }

    public ItemContaRepository getItemContaRepository() {
        return itemcontaRepository;
    }

    public void setItemContaRepository(ItemContaRepository itemcontaRepository) {
        this.itemcontaRepository = itemcontaRepository;
    }

   /* public ItemConta executar() {
        
        ClienteView clienteView = new ClienteView();        
        Cliente cliente = clienteView.executar();
        
        Conta conta = new Conta();
        
        conta.setCliente(cliente);
        //Item item = JOptionPane.showInputDialog("Item:");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
        
        ItemConta itemConta = new ItemConta();
        itemConta.setConta(conta);
        itemConta.setItem(item);
        itemConta.setQuantidade(quantidade);
    }*/
}