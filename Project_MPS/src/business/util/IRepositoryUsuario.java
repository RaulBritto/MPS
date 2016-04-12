package business.util;

import java.util.List;

import business.model.Usuario;

public interface IRepositoryUsuario {

	public void cadastrarUsuario(Usuario usuario);

	public List<Usuario> listarUsuarios();

	public Usuario buscarUsuarioPorLogin(String login);

	public void deletarUsuario(String login);

}
