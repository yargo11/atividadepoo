/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ContaController;
import java.util.List;
import javax.swing.JOptionPane;
import model.Conta;
import model.ItemConta;
import repositories.ContaRepository;

/**
 *
 * @author itamir.filho
 */
public class ContaView {
    
    private ContaController contaController;
    
    private ContaRepository contaRepository;
    
    public ContaView() {
        contaRepository = new ContaRepository();
        contaController = new ContaController(contaRepository);
    }

    public ContaController getContaController() {
        return contaController;
    }

    public void setContaController(ContaController contaController) {
        this.contaController = contaController;
    }

    public ContaRepository getContaRepository() {
        return contaRepository;
    }

    public void setContaRepository(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }
    
    public static void main(String[] args) {
        
        //List<ItemConta> itens = JOptionPane.showInputDialog("Itens: ");
        //Garcon garcon = JOptionPane.showInputDialog("Garcon: ");
    }}
