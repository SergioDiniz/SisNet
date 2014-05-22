package InterfacesDao;

import Connection.ConnectionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import redesocial.Mensagem;
import static redesocial.TratarDatas.converteDateSQL;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class MensagemDao implements MensagemDaoIT{

    private Connection conn;
    
    public MensagemDao() throws SQLException{
       this.conn = new ConnectionDAO().createConnection();
    }
    
    @Override
    public void persisteMensagem(Mensagem mensagem) {
        String sql = "INSERT INTO MENSAGEM VALUES(?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, mensagem.getIdMensagem());
            stat.setString(2, mensagem.getConteudo());
            stat.setDate(3, converteDateSQL(mensagem.getDataEnvio()));
            stat.setString(4, mensagem.getRemetente().getId());
            stat.setString(5, mensagem.getDestinatario().getId());
            
            stat.execute();
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
    }

    @Override
    public Mensagem localizaMensagem(String palavra) {
        Mensagem msg = new Mensagem();
        Usuario user = new Usuario();
        Usuario user1 = new Usuario();
        String sql = "SELECT * FROM MENSAGEM WHERE ID = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, palavra);
            ResultSet rs = stat.executeQuery();
            rs.next();
            
            msg.setIdMensagem(rs.getString(1));
            msg.setConteudo(rs.getString(2));
            msg.setDataEnvio(rs.getDate(3));
            user.setId(rs.getString(4));
            msg.setRemetente(user);
            user1.setId(rs.getString(5));
            msg.setDestinatario(user1);
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
        
        return msg;
    }

    @Override
    public void excluiMensagem(String palavra) {
        String sql = "DELETE FROM MENSAGEM WHERE ID = ?";
        
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, palavra);
            stat.execute();
            stat.close();
            
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
    }
}
