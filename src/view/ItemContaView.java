/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemContaController;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Conta;
import model.Item;
import model.ItemConta;
import repositories.ItemContaRepository;
import repositories.ItemRepository;

/**
 *
 * @author itamir.filho
 */
public class ItemContaView {

	private ItemContaController itemcontaController;

	private ItemContaRepository itemcontaRepository;

	public ItemContaView() {
		itemcontaRepository = new ItemContaRepository();
		itemcontaController = new ItemContaController(itemcontaRepository);
	}

	public ItemContaController getItemContaController() {
		return itemcontaController;
	}

	public void setItemContaController(ItemContaController itemcontaController) {
		this.itemcontaController = itemcontaController;
	}

	public ItemContaRepository getItemContaRepository() {
		return itemcontaRepository;
	}

	public void setItemContaRepository(ItemContaRepository itemcontaRepository) {
		this.itemcontaRepository = itemcontaRepository;
	}

	public ItemConta executar() {
		ItemContaView itemContaView = new ItemContaView();
		
		String[] itens = { "Coca" , "Guarana" , "Fanta" };
		Item item = (Item)JOptionPane.showInputDialog(null,"Escolha um item da lista:", "Lista de itens",JOptionPane.QUESTION_MESSAGE, null,
				itens, itens[0]);
		String[] contas = {"123","456","789"};
		Conta conta = (Conta)JOptionPane.showInputDialog(null,"Escolha uma conta:", "Lista de contas abertas",JOptionPane.QUESTION_MESSAGE, null,
				contas, contas[0]);
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
		
		ItemConta itemConta = new ItemConta();
		itemConta.setConta(conta);
		itemConta.setItem(item);
		itemConta.setQuantidade(quantidade);
		
		itemContaView.getItemContaController().salvar(itemConta);
		
		JOptionPane.showMessageDialog(null, itemContaView.getItemContaController().listar());
		
		return itemConta;
	}
	
	//public static void main(String[] args) {
		//ItemContaView itemContaView = new ItemContaView();
		
		//String[] itens = { "Coca" , "Guarana" , "Fanta" };
		//String item = (String)JOptionPane.showInputDialog(null,"Escolha um item da lista:", "Lista de itens",JOptionPane.QUESTION_MESSAGE, null,
		//		itens, itens[0]);
		
		//System.out.println(item);
	//}
}