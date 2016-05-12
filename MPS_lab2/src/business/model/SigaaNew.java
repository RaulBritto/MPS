package business.model;

import java.util.Map;
import java.util.HashMap;

public class SigaaNew implements Sigaa{
	public Map <Integer, String> mapaMatriculas;
	
	public SigaaNew() {
		// adiciona as matriculas automaticamente
		mapaMatriculas = new HashMap<Integer, String>();
		
		mapaMatriculas.put(1111,"Jose");
		mapaMatriculas.put(2222,"Silvio");
		mapaMatriculas.put(3333,"Pedro" );
		mapaMatriculas.put(4444,"Ronald");
		mapaMatriculas.put(5555,"Pedro2");
		
	}
	
	public void existeMatricula(int matricula, String name) {
		if(mapaMatriculas.containsKey(matricula) && mapaMatriculas.containsValue(name)){
			System.out.println("O usuário existe, pode prosseguir");
			
		}
		else{
			System.out.println("O usuario não existe, impossivel continuar");
			
		}
		
	}
}
