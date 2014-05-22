package InterfacesDao;

import Connection.ConnectionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import redesocial.SolicitacaoAmizade;
import static redesocial.TratarDatas.converteDateSQL;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class SolicitacaoDao implements SolicitacaoDaoIT{

    private Connection conn;
    
    public SolicitacaoDao() throws SQLException{
        this.conn = new ConnectionDAO().createConnection();
    }
    
    @Override
    public void persisteSolicitacao(SolicitacaoAmizade solicitacao) {
        String sql = "INSERT INTO SOLICITACAO_AMIZADE VALUES(?, ?, ?, ?, ?)";
        
        try{
           PreparedStatement stat = conn.prepareStatement(sql);
           stat.setInt(1, solicitacao.getId());
           stat.setString(2, solicitacao.getRemetente().getId());
           stat.setString(3, solicitacao.getDestinatario().getId());
           stat.setString(4, solicitacao.getMensagem());
           stat.setDate(5, converteDateSQL(solicitacao.getDataSolicitacao()));
           stat.execute();
           stat.close();
           
        }catch(SQLException err){
            System.out.println("ERROR! " +err.getMessage());
        }
    }

    @Override
    public SolicitacaoAmizade localizaSolicitacao(int id) {
        SolicitacaoAmizade solicitacao = new SolicitacaoAmizade();
        Usuario user = new Usuario();
        Usuario user1 = new Usuario();
        String sql = "SELECT * FROM SOLICITACAO_AMIZADE WHERE ID = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();
            rs.next();
            
            solicitacao.setId(rs.getInt(1));
            user.setId(rs.getString(2));
            solicitacao.setRemetente(user);
            user1.setId(rs.getString(3));
            solicitacao.setDestinatario(user1);
            solicitacao.setMensagem(rs.getString(4));
            solicitacao.setDataSolicitacao(rs.getDate(5));
            
            stat.close();
        }catch(SQLException err){
            System.out.println("ERROR! " +err.getMessage());
        }
        
        return solicitacao;
    }

    @Override
    public void excluiSolicitacao(int id) {
        String sql = "DELETE FROM SOLICITACAO_AMIZADE WHERE ID = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            stat.execute();
            stat.close();
        }catch(SQLException err){
            System.out.println("ERROR! " +err.getMessage());
        }
    }
    
}
