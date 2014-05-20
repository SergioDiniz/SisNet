package InterfacesDao;

import Connection.ConnectionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import redesocial.Foto;
import static redesocial.TratarDatas.converteDateSQL;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class FotosDao implements FotoDaoIT{

    private Connection conn;
    
    public FotosDao() throws SQLException{
        this.conn = new ConnectionDAO().createConnection();
    }
    
    @Override
    public void persisteFoto(Foto foto) {
        String sql = "INSERT INTO FOTO VALUES(?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, foto.getIdFoto());
            stat.setString(2, foto.getTitulo());
            stat.setString(3, foto.getTitulo());
            stat.setDate(4, converteDateSQL(foto.getDataPostagem()));
            stat.setString(5, foto.getUsuario().getId());
            
            stat.execute();
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
    }

    @Override
    public void excluiFoto(String id) {
        String sql = "DELETE FROM FOTO WHERE ID = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, id);
            stat.execute();
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
    }
    
}
