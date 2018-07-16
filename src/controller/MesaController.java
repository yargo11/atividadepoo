/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Mesa;
import repositories.MesaRepository;

/**
 *
 * @author itamir.filho
 */
public class MesaController {
    
    private MesaRepository mesaRepository;
    
        
    public MesaController(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    public void salvar(Mesa mesa) {
        mesaRepository.addMesa(mesa);
    }
    
    public void remover(Mesa mesa) {
        mesaRepository.removeMesa(mesa);
    }
    
    public void atualizar(Mesa mesaOld, Mesa mesaNew){
        mesaRepository.removeMesa(mesaOld);
        mesaRepository.addMesa(mesaNew);
    }
    
    public String listar() {
        String lista = "Lista de mesas \n";
        for (Mesa mesa : mesaRepository.listar()) {
            lista += mesa + "\n";
        }
        return lista;
    }
}