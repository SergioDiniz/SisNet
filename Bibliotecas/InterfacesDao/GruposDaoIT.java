package InterfacesDao;

import redesocial.Grupo;

/**
 *
 * @author Fatinha de Sousa
 */
public interface GruposDaoIT {

    public void persisteGrupo(Grupo grupo);
    
    public Grupo buscaGrupo(String nome);
    
    public void excluiGrupo(String nome);
}
