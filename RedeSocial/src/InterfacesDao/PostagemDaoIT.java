package InterfacesDao;

import redesocial.Postagem;

/**
 *
 * @author Fatinha de Sousa
 */
public interface PostagemDaoIT {

    public void addPostagem(Postagem postagem);
    
    public Postagem buscaPostagem(String id);
    
    public void excluiPostagem(String id);
}
