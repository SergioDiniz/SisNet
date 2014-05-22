package gerenciador;

import FactoryDaos.FactoryDao;
import FactoryDaos.FactoryDaoIT;
import InterfacesDao.TopicoDao;
import InterfacesDao.TopicoDaoIT;
import java.sql.SQLException;
import java.util.Date;
import redesocial.Grupo;
import redesocial.Topico;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class GerenciadorDeTopico {

    public void addTopico(String id, String descricao, Date data, Grupo grupo,
            Usuario usuario){
        Topico tp = new Topico();
        tp.setIdTopico(id);
        tp.setDescricao(descricao);
        tp.setDataTopico(data);
        tp.setGrupo(grupo);
        tp.setUsuario(usuario);
        
        FactoryDaoIT factory = FactoryDao.createFactory();
        TopicoDaoIT topico = factory.criarTopico();
        topico.persisteTopico(tp);
    }
    
    public Topico buscarTopico(String id) throws SQLException{
        TopicoDao topico = new TopicoDao();
        return topico.buscaTopico(id);
    }
    
    public void excluirTopico(String id) throws SQLException{
        TopicoDao topico = new TopicoDao();
        topico.excluiTopico(id);
    }
}
