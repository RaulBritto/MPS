package business.control;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import business.model.Componente;
 public class Componente_update implements Command_Componente{

	public void execute(Map<String, Componente> Mapa_componente, Componente c) {
		// TODO Auto-generated method stub
		if(Mapa_componente.containsKey(c.getNome())){
			int newQtde = changeQtde();
			ComponenteMemento CM = new ComponenteMemento(newQtde);
			c.C_CT.addMemento(CM);
			c.setQtde(newQtde);
			
		}
		
	}
	public int changeQtde(){
		Scanner in = new Scanner(System.in); // está aqui só para completar a função
											// responsabilidade da interface gráfica;
		System.out.println("Digite a nova quantidade");
		int s = in.nextInt();
		return s ;
		
	}

 }