package InterfacesDao;

import redesocial.Topico;

/**
 *
 * @author Fatinha de Sousa
 */
public interface TopicoDaoIT {

    public void persisteTopico(Topico topico);
    
    public Topico buscaTopico(String id);
    
    public void excluiTopico(String id);
}
