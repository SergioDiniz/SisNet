package FactoryDaos;

import InterfacesDao.FotoDaoIT;
import InterfacesDao.GruposDaoIT;
import InterfacesDao.UsuarioDaoIT;

/**
 *
 * @author Fatinha de Sousa
 */
public interface FactoryDaoIT {

    public UsuarioDaoIT criarUsuario();
    
    public FotoDaoIT criarFoto();
    
    public GruposDaoIT criarGrupo();
}
