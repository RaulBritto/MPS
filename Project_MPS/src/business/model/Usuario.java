package business.model;

public class Usuario {
	
	private String login;
	private String password;

	public Usuario() {
		
	}
	
	public Usuario(String login, String senha) {
		this.login = login;
		this.password = senha;
	}

	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", password=" + password + "]";
	}
	
	
	
}