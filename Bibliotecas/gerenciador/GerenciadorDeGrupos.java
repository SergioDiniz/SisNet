package gerenciador;

import FactoryDaos.FactoryDao;
import FactoryDaos.FactoryDaoIT;
import InterfacesDao.GrupoDao;
import InterfacesDao.GruposDaoIT;
import java.sql.SQLException;
import java.util.Date;
import redesocial.Grupo;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class GerenciadorDeGrupos {

    public void addGrupo(String id, String nome, String descricao, String nomeFundador,Date dataCriacao,
            Usuario fundador){
        Grupo grupo = new Grupo();
        grupo.setIdGrupo(id);
        grupo.setNome(nome);
        grupo.setDescricao(descricao);
        grupo.setNomeFundador(nomeFundador);
        grupo.setDataCriacao(dataCriacao);
        grupo.setCriador(fundador);
        
        FactoryDaoIT factory = FactoryDao.createFactory();
        GruposDaoIT grupos = factory.criarGrupo();
        grupos.persisteGrupo(grupo);
    }
    
    public Grupo localizaGrupo(String nome) throws SQLException{
        GrupoDao grupo = new GrupoDao();
        return grupo.buscaGrupo(nome);
    }
    
    public void excluirGrupo(String nome) throws SQLException{
        GrupoDao grupo = new GrupoDao();
        grupo.excluiGrupo(nome);
    }
}
