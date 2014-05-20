package InterfacesDao;

import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public interface UsuarioDaoIT {

    public void persisteUsuario(Usuario user);
    
    public Usuario buscaUsuario(String nome);
    
    public void excluiUsuario(String nome);
    
    public void desativaUsuario(String nome);
}