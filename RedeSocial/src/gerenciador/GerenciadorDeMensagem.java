package gerenciador;

import FactoryDaos.FactoryDao;
import FactoryDaos.FactoryDaoIT;
import InterfacesDao.MensagemDao;
import InterfacesDao.MensagemDaoIT;
import java.sql.SQLException;
import java.util.Date;
import redesocial.Mensagem;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class GerenciadorDeMensagem {

    public void addMensagem(String id, String conteudo, Date dataEnvio, Usuario usuario,
            Usuario destinatario){
    
        Mensagem mensagem = new Mensagem();
        mensagem.setIdMensagem(id);
        mensagem.setConteudo(conteudo);
        mensagem.setDataEnvio(dataEnvio);
        mensagem.setRemetente(usuario);
        mensagem.setDestinatario(destinatario);
        
        FactoryDaoIT factory = FactoryDao.createFactory();
        MensagemDaoIT msg = factory.criarMensagem();
        msg.persisteMensagem(mensagem);
    }
    
    public Mensagem buscarMensagem(String id) throws SQLException{
        MensagemDao mensagem = new MensagemDao();
        return mensagem.localizaMensagem(id);
    }
    
    public void excluirMensagem(String id) throws SQLException{
        MensagemDao mensagem = new MensagemDao();
        mensagem.excluiMensagem(id);
    }
}
