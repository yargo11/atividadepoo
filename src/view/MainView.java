package view;

import javax.swing.JOptionPane;

import controller.MainController;
import model.Mesa;

public class MainView {

	static ItemView itemView = new ItemView();
	static ClienteView clienteView = new ClienteView();
	static GarconView garconView = new GarconView();
	static MesaView mesaView = new MesaView();
	static ContaView contaView = new ContaView();

	private MainController mainController;
	private static String opcao;

	public MainView() {
		mainController = new MainController();
	}

	public static void main(String[] args) {

		while (!"Fim".equals(opcao)) {

			String[] opcoes = { "Cliente", "Conta", "Garcon", "ItemConta", "Item", "Mesa", "Fim" };
			String opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma operação:", "Lista de operações",
					JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			
			////////////////////////////////////////////
			
			if ("Item".equals(opcao)) {
				itemView.executar();
			}
			
			else if("Cliente".equals(opcao)) {
				clienteView.executar();
			}
			
			else if("Garcon".equals(opcao)) {
				garconView.executar();
			}
			
			else if("Mesa".equals(opcao)) {
				mesaView.executar();
			}
			
			else if("Conta".equals(opcao)) {
				contaView.executar();
			}
			
		}
	}
}
