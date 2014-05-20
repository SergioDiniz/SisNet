package gerenciador;

import FactoryDaos.FactoryDao;
import FactoryDaos.FactoryDaoIT;
import InterfacesDao.UsuarioDao;
import InterfacesDao.UsuarioDaoIT;
import java.sql.SQLException;
import java.util.Date;
import redesocial.Usuario;

/**
 *
 * @author Fatinha de Sousa
 */
public class GerenciadorDeUsuarios {

    public void addUsuario(String id, String nome, String senha, String apelido, String email,
            String profissao, String cidade, String Status, Date dataNascimento, String foto){
        
        Usuario user = new Usuario();
        user.setId(id);
        user.setNome(nome);
        user.setSenha(senha);
        user.setApelido(apelido);
        user.setEmail(email);
        user.setProfissao(profissao);
        user.setCidade(cidade);
        user.setStatus(Status);
        user.setDataNascimento(dataNascimento);
        user.setFoto(foto);
        
        FactoryDaoIT factory = FactoryDao.createFactory();
        UsuarioDaoIT user1 = factory.criarUsuario();
        user1.persisteUsuario(user);
    }
    
    public Usuario buscarUsuario(String nome) throws SQLException{
        UsuarioDao user = new UsuarioDao();
        return user.buscaUsuario(nome);
    }
    
    public void excluirUsuario(String nome) throws SQLException{
        UsuarioDao user = new UsuarioDao();
        user.excluiUsuario(nome);
    }
}
