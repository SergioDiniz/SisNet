package FactoryDaos;

import InterfacesDao.FotoDaoIT;
import InterfacesDao.GruposDaoIT;
import InterfacesDao.MensagemDaoIT;
import InterfacesDao.PostagemDaoIT;
import InterfacesDao.TopicoDaoIT;
import InterfacesDao.UsuarioDaoIT;
import InterfacesDao.SolicitacaoDaoIT;

/**
 *
 * @author Fatinha de Sousa
 */
public interface FactoryDaoIT {

    public UsuarioDaoIT criarUsuario();
    
    public FotoDaoIT criarFoto();
    
    public GruposDaoIT criarGrupo();
    
    public MensagemDaoIT criarMensagem();
    
    public PostagemDaoIT criarPostagem();
    
    public TopicoDaoIT criarTopico();
    
    public SolicitacaoDaoIT criarSolicitacao();
}
