/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ContaController;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import model.Cliente;
import model.Conta;
import model.Garcon;
import model.ItemConta;
import model.Mesa;
import repositories.ContaRepository;
import repositories.GarconRepository;
import controller.GarconController;
import sun.applet.Main;

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

	public GarconRepository garconRepository = new GarconRepository();
	public GarconController garconController = new GarconController(garconRepository);
	

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
	
	public Object getGarcons( List<Garcon> list) {
		return list.toString();
	}

	// public Conta executar() {
	public Conta executar() {

		// ContaView contaView = new ContaView();
		
		while (true) {
			//List<Garcon> garcons = new ArrayList<Garcon>();
			//List<Garcon> garcons = garconController.listar();
			List<Garcon> garcons = getGarconController.listar();

			Garcon garcon = (Garcon) JOptionPane.showInputDialog(null, "Escolha um garçon", "Lista de garçons",
					JOptionPane.QUESTION_MESSAGE, null, garcons.toArray(), this.getGarcons(garcons));

			String[] clientes = { "Janine", "Chefe", "Voce-Sabe-Quem" };
			Cliente cliente = (Cliente) JOptionPane.showInputDialog(null, "Escolha um cliente", "Lista de clientes",
					JOptionPane.QUESTION_MESSAGE, null, clientes, clientes[0]);

			String[] mesas = { "01", "02", "03" };
			Mesa mesa = (Mesa) JOptionPane.showInputDialog(null, "Escolha uma mesa", "Lista de mesas",
					JOptionPane.QUESTION_MESSAGE, null, mesas, mesas[0]);

			String[] listas = { "lista 01", "lista 02", "lista 03" };

			@SuppressWarnings("unchecked")
			List<ItemConta> itemConta = (List<ItemConta>) JOptionPane.showInputDialog(null, "Escolha uma lista",
					"Lista de listas", JOptionPane.QUESTION_MESSAGE, null, listas, listas[0]);

			Conta conta = new Conta();
			conta.setGarcon(garcon);
			conta.setCliente(cliente);
			conta.setMesa(mesa);
			conta.setItens(itemConta);

			contaController.salvar(conta);

			JOptionPane.showMessageDialog(null, getContaController().listar());

			return conta;
		}
	}

}
