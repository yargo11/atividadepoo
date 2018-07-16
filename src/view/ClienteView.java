/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import javax.swing.JOptionPane;
import model.Cliente;
import repositories.ClienteRepository;

/**
 *
 * @author itamir.filho
 */
public class ClienteView {
    
    private ClienteController clienteController;
    
    private ClienteRepository clienteRepository;
    
    public ClienteView() {
        clienteRepository = new ClienteRepository();
        clienteController = new ClienteController(clienteRepository);
    }

    public ClienteController getClienteController() {
        return clienteController;
    }

    public void setClienteController(ClienteController clienteController) {
        this.clienteController = clienteController;
    }

    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }

    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente executar() {
        
        String nome = JOptionPane.showInputDialog("Nome: ");
        String cpf = JOptionPane.showInputDialog("CPF: ");
        String endereco = JOptionPane.showInputDialog("Endereço: ");
        String telefone = JOptionPane.showInputDialog("Telefone: ");
        String cartaofidelidade = JOptionPane.showInputDialog("Cartao Fidelidade: ");
        String credito = JOptionPane.showInputDialog("Credito: ");
        
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEndereco(endereco);
        cliente.setTelefone(telefone);
        cliente.setCartaoFidelidade(cartaofidelidade);
        cliente.setCredito(credito);
        
        ClienteView clienteView = new ClienteView();
        clienteView.getClienteController().salvar(cliente);
        
        JOptionPane.showMessageDialog(null, 
                clienteView.getClienteController().listar());
        
        return cliente;
    }
}