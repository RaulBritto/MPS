package business.model;

public class Professor extends Usuario  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String departamento;
	private String campus;
	
	public Professor(String name, int idade, String matricula, int cpf, String login, String senha, String departamento,
			String campus) {
		super(name, idade, matricula, cpf, login, senha);
		this.departamento = departamento;
		this.campus = campus;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}
	
	
}
