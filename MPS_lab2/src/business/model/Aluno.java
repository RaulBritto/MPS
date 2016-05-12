package business.model;

public class Aluno extends Usuario {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double data_ingresso;
	
	public Aluno(String name, int idade, int cpf, String login, String senha, String matricula, double data_ingresso) {
		super(name, idade,matricula, cpf, login, senha);
		this.data_ingresso = data_ingresso;
	}

	public double getData_ingresso() {
		return data_ingresso;
	}

	public void setData_ingresso(float data_ingresso) {
		this.data_ingresso = data_ingresso;
	}

	

}
