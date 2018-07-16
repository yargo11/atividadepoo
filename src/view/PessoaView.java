/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PessoaController;
import javax.swing.JOptionPane;
import model.Pessoa;
import repositories.PessoaRepository;

/**
 *
 * @author itamir.filho
 */
public class PessoaView {
    
    private PessoaController pessoaController;
    
    private PessoaRepository pessoaRepository;
    
    public PessoaView() {
        pessoaRepository = new PessoaRepository();
        pessoaController = new PessoaController(pessoaRepository);
    }

    public PessoaController getPessoaController() {
        return pessoaController;
    }

    public void setPessoaController(PessoaController pessoaController) {
        this.pessoaController = pessoaController;
    }

    public PessoaRepository getPessoaRepository() {
        return pessoaRepository;
    }

    public void setPessoaRepository(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }}