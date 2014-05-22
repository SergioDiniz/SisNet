package InterfacesDao;

import Connection.ConnectionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import redesocial.Postagem;
import static redesocial.TratarDatas.converteDateSQL;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class PostagemDao implements PostagemDaoIT{

    private Connection conn;
    
    public PostagemDao() throws SQLException{
        this.conn = new ConnectionDAO().createConnection();
    }
    
    @Override
    public void addPostagem(Postagem postagem) {
        String sql = "INSERT INTO POSTAGEM VALUES(?, ?, ?, ?)";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, postagem.getIdPostagem());
            stat.setString(2, postagem.getConteudo());
            stat.setDate(3, converteDateSQL(postagem.getDataPostagem()));
            stat.setString(4, postagem.getUsuario().getId());
            
            stat.execute();
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
    }

    @Override
    public Postagem buscaPostagem(String id) {
        Postagem pst = new Postagem();
        Usuario user = new Usuario();
        String sql = "SELECT * FROM POSTAGEM WHERE ID = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, id);
            ResultSet rs = stat.executeQuery();
            rs.next();
            
            pst.setIdPostagem(rs.getString(1));
            pst.setConteudo(rs.getString(2));
            pst.setDataPostagem(rs.getDate(3));
            user.setId(rs.getString(4));
            pst.setUsuario(user);
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
        
        return pst;
    }

    @Override
    public void excluiPostagem(String id) {
        String sql = "DELETE FROM POSTAGEM WHERE ID = ?";
        
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
