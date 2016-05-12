package business.model;

import java.io.Serializable;

public abstract class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int idade;
	private String matricula;
	private int cpf;
	private String login;
	private String senha;
	
	public Usuario(String name, int idade,String matricula,  int cpf, String login, String senha) {
		this.name = name;
		this.idade = idade;
		this.cpf = cpf;
		this.matricula  = matricula;
		this.login = login;
		this.senha = senha;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString(){
		return new StringBuffer("Name: ").append(this.name).append("Mat: ").append(this.matricula) .append(" Login: ").append(this.login).toString();
	}
}
