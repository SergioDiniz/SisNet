package FactoryDaos;

import InterfacesDao.FotoDaoIT;
import InterfacesDao.FotosDao;
import InterfacesDao.GrupoDao;
import InterfacesDao.GruposDaoIT;
import InterfacesDao.MensagemDao;
import InterfacesDao.MensagemDaoIT;
import InterfacesDao.PostagemDao;
import InterfacesDao.PostagemDaoIT;
import InterfacesDao.SolicitacaoDao;
import InterfacesDao.SolicitacaoDaoIT;
import InterfacesDao.TopicoDao;
import InterfacesDao.TopicoDaoIT;
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
    private MensagemDao mensagem;
    private PostagemDao postagem;
    private TopicoDao topico;
    private SolicitacaoDao solicitacao;
    
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
    
    @Override
    public MensagemDaoIT criarMensagem(){
        try{
            mensagem = new MensagemDao();
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
        
        return mensagem;
    }
    
    @Override
    public PostagemDaoIT criarPostagem(){
        try{
            postagem = new PostagemDao();
        } catch (SQLException ex) {
            System.out.println("FATAL ERROR! " +ex.getMessage());
        }
        
        return postagem;
    }
    
    @Override
    public TopicoDaoIT criarTopico(){
        try{
            topico = new TopicoDao();
        }catch(SQLException err){
            System.out.println("FATAL ERROR! " +err.getMessage());
        }
        
        return topico;
    }
    
    @Override
    public SolicitacaoDaoIT criarSolicitacao(){
        try{
            solicitacao = new SolicitacaoDao();
        }catch(SQLException err){
            System.out.println("ERROR! " +err.getMessage());
        }
        return solicitacao;
    }
}
