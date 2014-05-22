package gerenciador;

import FactoryDaos.FactoryDao;
import FactoryDaos.FactoryDaoIT;
import InterfacesDao.SolicitacaoDao;
import InterfacesDao.SolicitacaoDaoIT;
import java.sql.SQLException;
import java.util.Date;
import redesocial.SolicitacaoAmizade;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class GerenciadorDeSolicitacao {

    public void addSolicitacao(int id, Usuario remetente, Usuario destinatario,
            String mensagem, Date dataEnvio){
        SolicitacaoAmizade solicitacao = new SolicitacaoAmizade();
        solicitacao.setId(id);
        solicitacao.setRemetente(remetente);
        solicitacao.setDestinatario(destinatario);
        solicitacao.setMensagem(mensagem);
        solicitacao.setDataSolicitacao(dataEnvio);
        
        FactoryDaoIT factory = FactoryDao.createFactory();
        SolicitacaoDaoIT sol = factory.criarSolicitacao();
        sol.persisteSolicitacao(solicitacao);
    }
    
    public SolicitacaoAmizade localizaSolicitacao(int id) throws SQLException{
        SolicitacaoDao solicitacao = new SolicitacaoDao();
        return solicitacao.localizaSolicitacao(id);
    }
    
    public void excluirSolicitacao(int id) throws SQLException{
        SolicitacaoDao solicitacao = new SolicitacaoDao();
        solicitacao.excluiSolicitacao(id);
    }
}
