package gerenciador;

import FactoryDaos.FactoryDao;
import FactoryDaos.FactoryDaoIT;
import InterfacesDao.PostagemDao;
import InterfacesDao.PostagemDaoIT;
import java.sql.SQLException;
import java.util.Date;
import redesocial.Postagem;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class GerenciadorDePostagem {

    public void addPostagem(String id, String conteudo, Date dataPostagem, Usuario user){
       Postagem postagem = new Postagem();
       postagem.setIdPostagem(id);
       postagem.setConteudo(conteudo);
       postagem.setDataPostagem(dataPostagem);
       postagem.setUsuario(user);
       
       FactoryDaoIT factory = FactoryDao.createFactory();
       PostagemDaoIT post = factory.criarPostagem();
       post.addPostagem(postagem);
    }
    
    public Postagem localizaPostagem(String id) throws SQLException{
        PostagemDao postagem = new PostagemDao();
        return postagem.buscaPostagem(id);
    }
    
    public void excluiPostagem(String id) throws SQLException{
        PostagemDao postagem = new PostagemDao();
        postagem.excluiPostagem(id);
    }
}
