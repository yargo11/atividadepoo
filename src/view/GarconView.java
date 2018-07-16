/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GarconController;
import javax.swing.JOptionPane;
import model.Garcon;
import repositories.GarconRepository;

/**
 *
 * @author itamir.filho
 */
public class GarconView {
    
    private GarconController pessoaController;
    
    private GarconRepository pessoaRepository;
    
    public GarconView() {
        pessoaRepository = new GarconRepository();
        pessoaController = new GarconController(pessoaRepository);
    }

    public GarconController getGarconController() {
        return pessoaController;
    }

    public void setGarconController(GarconController pessoaController) {
        this.pessoaController = pessoaController;
    }

    public GarconRepository getGarconRepository() {
        return pessoaRepository;
    }

    public void setGarconRepository(GarconRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }
    
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Nome: ");
        String cpf = JOptionPane.showInputDialog("CPF: ");
        String endereco = JOptionPane.showInputDialog("Endereço: ");
        String telefone = JOptionPane.showInputDialog("Telefone: ");
        String matricula = JOptionPane.showInputDialog("Matricula: ");
        String carteiraTrabalho = JOptionPane.showInputDialog("Carteira Trabalho: ");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));
        
        Garcon garcon = new Garcon();
        garcon.setNome(nome);
        garcon.setCpf(cpf);
        garcon.setEndereco(endereco);
        garcon.setTelefone(telefone);
        garcon.setMatricula(matricula);
        garcon.setCarteiraTrabalho(carteiraTrabalho);
        garcon.setSalario(salario);
        
        GarconView garconView = new GarconView();
        garconView.getGarconController().salvar(garcon);
        
        JOptionPane.showMessageDialog(null, 
                garconView.getGarconController().listar());
    }
}
