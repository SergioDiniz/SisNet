package InterfacesDao;

import redesocial.Mensagem;

/**
 *
 * @author Fatinha de Sousa
 */
public interface MensagemDaoIT {

    public void persisteMensagem(Mensagem mensagem);
    
    public Mensagem localizaMensagem(String palavra);
    
    public void excluiMensagem(String palavra);
}
