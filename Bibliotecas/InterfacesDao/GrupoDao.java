package InterfacesDao;

import Connection.ConnectionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import redesocial.Grupo;
import static redesocial.TratarDatas.converteDateSQL;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class GrupoDao implements GruposDaoIT{

    private Connection conn;
    
    public GrupoDao() throws SQLException{
      this.conn = new ConnectionDAO().createConnection();  
    }
    
    @Override
    public void persisteGrupo(Grupo grupo) {
        String sql = "INSERT INTO GRUPO VALUES(?, ?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, grupo.getIdGrupo());
            stat.setString(2, grupo.getNome());
            stat.setString(3, grupo.getDescricao());
            stat.setString(4, grupo.getNomeFundador());
            stat.setDate(5, converteDateSQL(grupo.getDataCriacao()));
            stat.setString(6, grupo.getCriador().getId());
            
            stat.execute();
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
    }

    @Override
    public Grupo buscaGrupo(String nome) {
        Grupo grupo = new Grupo();
        Usuario user = new Usuario();
        String sql = "SELECT * FROM GRUPO WHERE NOME_GRUPO = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nome);
            ResultSet rs = stat.executeQuery();
            
            rs.next();
            grupo.setIdGrupo(rs.getString(1));
            grupo.setNome(rs.getString(2));
            grupo.setDescricao(rs.getString(3));
            grupo.setNomeFundador(rs.getString(4));
            grupo.setDataCriacao(rs.getDate(5));
            user.setId(rs.getString(6));
            grupo.setCriador(user);
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
        
        return grupo;
    }

    @Override
    public void excluiGrupo(String nome) {
        String sql = "DELETE FROM GRUPO WHERE NOME_GRUPO = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nome);
            stat.execute();
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
    }
    
}
