package business.model;

import java.awt.Component;

import business.control.ComponenteMemento;
import business.control.Componente_careTaker;

public class Componente {
	private String nome;
	private int qtde;
	private float valor;
	public Componente_careTaker C_CT;
	public Componente(String n, int q, float v){
		nome = n;
		qtde = q;
		valor = v;
		C_CT = new Componente_careTaker();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String toString(){
		return "Nome: " + nome + " "+ "Quantidade: " + qtde + " " + "Valor: " + valor + "\n";
	}
}
