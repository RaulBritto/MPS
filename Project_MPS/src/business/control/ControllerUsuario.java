package business.control;

import infra.UserFile;

import java.util.List;
import java.util.logging.Level;

import dao.UsuarioDAO;
import business.model.Usuario;
import business.util.IRepositoryUsuario;
import business.util.InfraException;
import business.util.PasswordException;
import business.util.UserException;

public class ControllerUsuario {

	private IRepositoryUsuario repositoryUsuario;
	UserFile userFile;

	public ControllerUsuario() {
		this.repositoryUsuario = new UsuarioDAO();
		
		/*userFile = new UserFile();
		try {
			repositoryUsuario = (IRepositoryUsuario) userFile.loadUsers();
		} catch (InfraException e) {
			UserFile.logger.log(Level.FINE, e.getMessage());
		} 
		*/
	}

	
	
	public void cadastrarUsuario(Usuario usuario) throws UserException, PasswordException {

            validarLogin(usuario.getLogin());
            validarPassword(usuario.getPassword());
            
			repositoryUsuario.cadastrarUsuario(usuario);
			//userFile.saveUsers(usuario);

	}

	public List<Usuario> listarUsuarios() {
		List<Usuario> usuarios = repositoryUsuario.listarUsuarios();
		return usuarios;
	}

	public Usuario buscarUsuarioPorLogin(String login) {
		return repositoryUsuario.buscarUsuarioPorLogin(login);
	}

	public void deletarUsuario(String login) {
		repositoryUsuario.deletarUsuario(login);

	}

	public void validarLogin(String login) throws UserException {

		if (login.isEmpty()) {
			throw new UserException("Insira o nome do usuario!");

		}
		if (login.length() > 20) {
			throw new UserException("Nome de usuário deve conter no maximo 20 caracteres!");

		}
		if (login.matches(".*\\d.*")) {
			throw new UserException("Nome de usuário contém números");
		}
	}
	
	public void validarPassword(String senha) throws PasswordException {
	
		// SENHA
		if (senha.length() > 12) {
			throw new PasswordException("Senha muito grande");
		}
		if (senha.length() < 8) {
			throw new PasswordException("Senha muito curta");
		}
		/*if (senha.matches("^(?=.*?\\d.*\\d)[a-zA-Z0-9]{8,}$")) {
			throw new PasswordException("Senha deve ter ao menos 2 numeros e letras");
		}*/

	}

}
