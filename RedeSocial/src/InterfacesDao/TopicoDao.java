package InterfacesDao;

import Connection.ConnectionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import redesocial.Grupo;
import redesocial.Topico;
import static redesocial.TratarDatas.converteDateSQL;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class TopicoDao implements TopicoDaoIT{

    private Connection conn;
    
    public TopicoDao() throws SQLException{
        this.conn = new ConnectionDAO().createConnection();
    }
    
    @Override
    public void persisteTopico(Topico topico) {
        String sql = "INSERT INTO TOPICO VALUES(?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, topico.getIdTopico());
            stat.setString(2, topico.getDescricao());
            stat.setDate(3, converteDateSQL(topico.getDataTopico()));
            stat.setString(4, topico.getGrupo().getIdGrupo());
            stat.setString(5, topico.getUsuario().getId());
            
            stat.execute();
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
        
    }

    @Override
    public Topico buscaTopico(String id) {
        Topico tp = new Topico();
        Usuario user = new Usuario();
        Grupo grupo = new Grupo();
        String sql = "SELECT * FROM TOPICO WHERE ID = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, id);
            ResultSet rs = stat.executeQuery();
            
            rs.next();
            tp.setIdTopico(rs.getString(1));
            tp.setDescricao(rs.getString(2));
            tp.setDataTopico(rs.getDate(3));
            grupo.setIdGrupo(rs.getString(4));
            tp.setGrupo(grupo);
            user.setId(rs.getString(5));
            tp.setUsuario(user);
            
            stat.close();
        }catch(SQLException err){
            System.out.println("ERROR! " +err.getMessage());
        }
        
        return tp;
    }

    @Override
    public void excluiTopico(String id) {
        String sql = "DELETE FROM TOPICO WHERE ID = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, id);
            stat.execute();
            stat.close();
            
        }catch(SQLException err){
            System.out.println("ERROR! " +err.getMessage());
        }
    }
    
}
