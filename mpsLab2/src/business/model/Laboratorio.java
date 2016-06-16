package business.model;

import java.util.ArrayList;
import java.util.Map;

public class Laboratorio {
	public static Laboratorio instancia;
	private static int contador;
	protected Laboratorio(){
		
	}
	public static Laboratorio getInstancia(){
		if(instancia == null){
			instancia = new Laboratorio();
			contador = 0;
		}
		return instancia;
	}
	public void retornarTamanho(Map<String, Usuario> u){
		System.out.println("Tamanho do Map: " + u.size());
		contador++;
		System.out.println("Recurso chamado " + contador + " vezes");
	}
}
