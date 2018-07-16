/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author yargo.valerio
 */
public class ClienteRepository {
    
    private final List<Cliente> clientes;
    
    public ClienteRepository(){
        clientes = new ArrayList<>();
    }
    
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void removeCliente(Cliente cliente){
        clientes.remove(cliente);
    }
    
    public List<Cliente> listar(){
        return clientes;
    }
}
