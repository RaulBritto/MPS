package view;


import javax.swing.JOptionPane;

import business.control.*;



public class View {
	
	
	private static String name;
	private static String brand;
	private static int quant;
	private static String descprition;
	private static int code;
	
	public static void main(String[] args){
		
		int selection = 0;
		Facede fachada = new Facede();
		do{
			try{
				selection = Integer.parseInt(JOptionPane.showInputDialog("Bem-vindo ao sistema LabProj!\n"
									+ "Digite 1: para cadastrar\n"
									+ "Digite 2: para listar\n"
									+ "Digite 3: para remover\n"
									+ "Digite 4: para sair\n"));
			
				switch(selection){
				case 1: 
						
							name = JOptionPane.showInputDialog("Digite o nome do instrumento");
							brand = JOptionPane.showInputDialog("Digite a marca do instrumento");
							quant = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos instrumentos serao cadastrados: "));
							code = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do instumento: "));
							descprition = JOptionPane.showInputDialog("Digite uma descrição para o instrumento");
							fachada.addInstrument(name, brand, quant, code, descprition);
							break;
						
				case 2: 
						fachada.listInstrument();
						break;
						
				case 3: name = JOptionPane.showInputDialog("Digite o nome do instrumento");
						fachada.removeInstrument(name);
						break;
				}
			
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Entrada invalida!", "Error", JOptionPane.ERROR_MESSAGE);
			}	
			
		}while(selection !=4);
	}

}
