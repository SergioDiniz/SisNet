package InterfacesDao;

import Connection.ConnectionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import static redesocial.TratarDatas.converteDateSQL;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class UsuarioDao implements UsuarioDaoIT{

    private Connection conn;
    
    public UsuarioDao() throws SQLException{
        this.conn = new ConnectionDAO().createConnection();
    }
    @Override
    public void persisteUsuario(Usuario user) {
        String sql = "INSERT INTO USUARIO VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
    
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, user.getId());
            stat.setString(2, user.getNome());
            stat.setString(3, user.getSenha());
            stat.setString(4, user.getApelido());
            stat.setString(5, user.getEmail());
            stat.setString(6, user.getProfissao());
            stat.setString(7, user.getCidade());
            stat.setString(8, user.getStatus());
            stat.setDate(9, converteDateSQL(user.getDataNascimento()));
            stat.setString(10, user.getFoto());
            
            stat.execute();
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
    }

    @Override
    public Usuario buscaUsuario(String nome) {
        Usuario user = new Usuario();
        String sql = "SELECT * FROM USUARIO WHERE NOME = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nome);
            ResultSet rs = stat.executeQuery();
            
            rs.next();
            
            user.setId(rs.getString(1));
            user.setNome(rs.getString(2));
            user.setSenha(rs.getString(3));
            user.setApelido(rs.getString(4));
            user.setEmail(rs.getString(5));
            user.setProfissao(rs.getString(6));
            user.setCidade(rs.getString(7));
            user.setStatus(rs.getString(8));
            user.setDataNascimento(rs.getDate(9));
            user.setFoto(rs.getString(10));
            stat.close();
        }catch(SQLException err){
            System.out.println("FATAL ERROR!" +err.getMessage());
        }
        
        return user;
    }

    @Override
    public void excluiUsuario(String nome) {
        String sql = "DELETE FROM USUARIO WHERE NOME = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nome);
            stat.execute();
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
    }

    @Override
    public void desativaUsuario(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }   
}