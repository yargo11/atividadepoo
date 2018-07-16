/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Garcon;
import repositories.GarconRepository;

/**
 *
 * @author itamir.filho
 */
public class GarconController {
    
    private GarconRepository garconRepository;
    
        
    public GarconController(GarconRepository garconRepository) {
        this.garconRepository = garconRepository;
    }

    public void salvar(Garcon garcon) {
        garconRepository.addGarcon(garcon);
    }
    
    public void remover(Garcon garcon) {
        garconRepository.removeGarcon(garcon);
    }
    
    public void atualizar(Garcon garconOld, Garcon garconNew){
        garconRepository.removeGarcon(garconOld);
        garconRepository.addGarcon(garconNew);
    }
    
    public String listar() {
        String lista = "Lista de garcons \n";
        for (Garcon garcon : garconRepository.listar()) {
            lista += garcon + "\n";
        }
        return lista;
    }
}