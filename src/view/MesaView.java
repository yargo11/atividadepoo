/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MesaController;
import javax.swing.JOptionPane;
import model.Mesa;
import repositories.MesaRepository;

/**
 *
 * @author itamir.filho
 */
public class MesaView {

	private MesaController mesaController;

	private MesaRepository mesaRepository;

	public MesaView() {
		mesaRepository = new MesaRepository();
		mesaController = new MesaController(mesaRepository);
	}

	public MesaController getMesaController() {
		return mesaController;
	}

	public void setMesaController(MesaController mesaController) {
		this.mesaController = mesaController;
	}

	public MesaRepository getMesaRepository() {
		return mesaRepository;
	}

	public void setMesaRepository(MesaRepository mesaRepository) {
		this.mesaRepository = mesaRepository;
	}

	public Mesa executar() {

		//MesaView mesaView = new MesaView();

		while (true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));

			Mesa mesa = new Mesa();
			mesa.setNumero(numero);

			mesaController.salvar(mesa);

			JOptionPane.showMessageDialog(null, getMesaController().listar());
			
			return mesa;
		}
	}
}