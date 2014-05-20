package FactoryDaos;

import InterfacesDao.FotoDaoIT;
import InterfacesDao.FotosDao;
import InterfacesDao.GrupoDao;
import InterfacesDao.GruposDaoIT;
import InterfacesDao.UsuarioDao;
import InterfacesDao.UsuarioDaoIT;
import java.sql.SQLException;

/**
 *
 * @author Fatinha de Sousa
 */
public class FactoryDaoBD implements FactoryDaoIT{

    private UsuarioDao user;
    private FotosDao foto;
    private GrupoDao grupo;
    
    @Override
    public UsuarioDaoIT criarUsuario() {
        try {
            user = new UsuarioDao();
        } catch (SQLException ex) {
            System.out.println("FATAL ERROR! " +ex.getMessage());
        }
        
        return user;
    }

    @Override
    public FotoDaoIT criarFoto() {
        try {
            foto = new FotosDao();
        } catch (SQLException ex) {
            System.out.println("FATAL ERROR! " +ex.getMessage());
        }
        
        return foto;
    }
    
    @Override
    public GruposDaoIT criarGrupo(){
        
        try{
            grupo = new GrupoDao();
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
        
        return grupo;
    }
    
}
