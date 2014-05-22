
package ClassePrinciapl;
import gerenciador.GerenciadorDeFotos;
import gerenciador.GerenciadorDeGrupos;
import gerenciador.GerenciadorDeMensagem;
import gerenciador.GerenciadorDePostagem;
import gerenciador.GerenciadorDeSolicitacao;
import gerenciador.GerenciadorDeTopico;
import gerenciador.GerenciadorDeUsuarios;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import redesocial.Grupo;
import static redesocial.TratarDatas.converterStringParaDate;
import redesocial.Usuario;
/**
 *
 * @author Fatinha de Sousa
 */
public class App {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ParseException, SQLException {
        
        GerenciadorDeUsuarios gu = new GerenciadorDeUsuarios();
        GerenciadorDeFotos gf = new GerenciadorDeFotos();
        GerenciadorDeGrupos gg = new GerenciadorDeGrupos();
        GerenciadorDeMensagem gm = new GerenciadorDeMensagem();
        GerenciadorDePostagem gp = new GerenciadorDePostagem();
        GerenciadorDeTopico gt = new GerenciadorDeTopico();
        GerenciadorDeSolicitacao gs = new GerenciadorDeSolicitacao();
        
        Usuario user = new Usuario();
        Usuario user1 = new Usuario();
        user = gu.buscarUsuario("Fatinha de Sousa");
        user1 = gu.buscarUsuario("Neto Abrantes");
        
        //gs.addSolicitacao(1, user, user1, "Oi Aceita, Por favor!",converterStringParaDate("21/05/2014"));
        //System.out.println(gs.localizaSolicitacao(1));
        //gs.excluirSolicitacao(1);
    }
}
