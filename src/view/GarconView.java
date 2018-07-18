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

	private GarconController garconController;

	private GarconRepository garconRepository;

	public GarconView() {
		garconRepository = new GarconRepository();
		garconController = new GarconController(garconRepository);
	}

	public GarconController getGarconController() {
		return garconController;
	}

	public void setGarconController(GarconController garconController) {
		this.garconController = garconController;
	}

	public GarconRepository getGarconRepository() {
		return garconRepository;
	}

	public void setGarconRepository(GarconRepository garconRepository) {
		this.garconRepository = garconRepository;
	}

	public Garcon executar(){

		//GarconView garconView = new GarconView();
		while (true) {
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

			garconController.salvar(garcon);

			JOptionPane.showMessageDialog(null, getGarconController().listar());
			
			return garcon;
		}
	}
}
