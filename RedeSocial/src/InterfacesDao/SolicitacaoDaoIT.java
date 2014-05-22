package InterfacesDao;

import redesocial.SolicitacaoAmizade;

/**
 *
 * @author Fatinha de Sousa
 */
public interface SolicitacaoDaoIT {

    public void persisteSolicitacao(SolicitacaoAmizade solicitacao);
    
    public SolicitacaoAmizade localizaSolicitacao(int id);
    
    public void excluiSolicitacao(int id);
}
