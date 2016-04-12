	package view;


import java.util.List;

import javax.swing.JOptionPane;









import business.control.ControllerUsuario;
import business.model.Usuario;
import business.util.PasswordException;
import business.util.UserException;

	

	public class ScreenView {
		
	private static String login;
	private static String senha;
		
		public static void main (String[] args) {
			
			ControllerUsuario controllerUsuario = new 	ControllerUsuario();		
			boolean checkedLogin = false;
			boolean checkedPassword = false;
			
		 int opcao;
			do {
			opcao = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(""
									+ "Escolha uma das opçoes abaixo:\n"
									+ "1: Inserir usuario\n"
									+ "2: Remover usuario a partir do login \n"
									+ "3: Listar todos os usuarios \n"
									+ "4: Sair da apliçao\n"));

			switch (opcao) {
			case 1:
				while(!checkedLogin || !checkedPassword){
					try{
						if(!checkedLogin)login = JOptionPane.showInputDialog("Digite o login do usuario");
						if(!checkedPassword) senha = JOptionPane.showInputDialog("Digite a senha do usuario");
						Usuario usuario = new Usuario(login, senha);
						controllerUsuario.cadastrarUsuario(usuario);
						checkedLogin = true;
						checkedPassword = true;
					}catch(UserException e){
						JOptionPane.showMessageDialog(null, e.getMessage() );
					
					}catch(PasswordException e){
						JOptionPane.showMessageDialog(null, e.getMessage() );
						checkedLogin = true;
						checkedPassword = false;
					}
				}
				checkedLogin = false;
				checkedPassword = false;
				break;
				
				
			case 2:
				login = JOptionPane.showInputDialog("Digite o login do usuario");
				Usuario usuario = controllerUsuario.buscarUsuarioPorLogin(login);
				controllerUsuario.deletarUsuario(login);
				break;

			case 3:
				List<Usuario> todosUsuarios = controllerUsuario.listarUsuarios();
			
			String unir2 = "";
				
				if (todosUsuarios.size() > 0) {
					for (Usuario usuario2 : todosUsuarios) {
						unir2 += usuario2.toString() + "\n";
							System.out.println( unir2);
				}
					JOptionPane.showMessageDialog(null, unir2);
				} else {
					JOptionPane.showMessageDialog(null,	"Sem resultado.\nVerifique sua consulta!");
				}

				break;

			default:
				JOptionPane.showMessageDialog(null,	"Fim do Programa");
			}

		} while (opcao < 4);

	}
			
}
	
