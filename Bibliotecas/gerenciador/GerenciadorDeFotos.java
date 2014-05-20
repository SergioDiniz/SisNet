package gerenciador;

import FactoryDaos.FactoryDao;
import FactoryDaos.FactoryDaoIT;
import InterfacesDao.FotoDaoIT;
import InterfacesDao.FotosDao;
import java.sql.SQLException;
import java.util.Date;
import redesocial.Foto;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class GerenciadorDeFotos {

    public void addFoto(String id, String titulo, String caminho, Date data, Usuario user){
        Foto foto = new Foto();
        foto.setIdFoto(id);
        foto.setTitulo(titulo);
        foto.setCaminho(caminho);
        foto.setDataPostagem(data);
        foto.setUsuario(user);
        
        FactoryDaoIT factory = FactoryDao.createFactory();
        FotoDaoIT photo = factory.criarFoto();
        photo.persisteFoto(foto);
    }
    
    public void removeFoto(String id) throws SQLException{
        FotoDaoIT foto = new FotosDao();
        foto.excluiFoto(id);
        
    }
}
