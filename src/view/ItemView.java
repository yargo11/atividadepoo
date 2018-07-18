/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemController;
import javax.swing.JOptionPane;
import model.Item;
import repositories.ItemRepository;

/**
 *
 * @author itamir.filho
 */
public class ItemView {

	private ItemController itemController;

	private ItemRepository itemRepository;

	public ItemView() {
		itemRepository = new ItemRepository();
		itemController = new ItemController(itemRepository);
	}

	public ItemController getItemController() {
		return itemController;
	}

	public void setItemController(ItemController itemController) {
		this.itemController = itemController;
	}

	public ItemRepository getItemRepository() {
		return itemRepository;
	}

	public void setItemRepository(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	public Item executar() {
		//ItemView itemView = new ItemView();

		while (true) {
			String descricao = JOptionPane.showInputDialog("Descrição:");
			String marca = JOptionPane.showInputDialog("Marca:");
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));

			Item item = new Item();
			item.setDescricao(descricao);
			item.setMarca(marca);
			item.setValor(valor);

			itemController.salvar(item);

			JOptionPane.showMessageDialog(null, getItemController().listar());
			
		return item;
		}
	}
}
