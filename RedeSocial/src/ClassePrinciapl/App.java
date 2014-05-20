
package ClassePrinciapl;
import gerenciador.GerenciadorDeFotos;
import gerenciador.GerenciadorDeGrupos;
import gerenciador.GerenciadorDeUsuarios;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
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
        
        //Testes da Classe Usuario APP;
        //gu.addUsuario("U-0001", "Fatinha de Sousa", "thisisit", "Fatinha", "fatinha@hotmail.com", "Analista de Sistemas", 
        //        "Cajazeiras", "Solteira", converterStringParaDate("14/06/1994"), "Love Live Forever");
    
        //System.out.println(gu.buscarUsuario("Fatinha de Sousa"));
        //gu.excluirUsuario("Fatinha de Sousa");
        
        //Testes da Classe Foto;
        //Usuario user = new Usuario();
        //user = gu.buscarUsuario("Fatinha de Sousa");
        //gf.addFoto("FT-0002", "Programacao da Depressao", "localhost", converterStringParaDate("19/05/2014"), 
        //        user);
        //gf.removeFoto("FT-0002");
        
        //Testes da Classe Grupo;
        //gg.addGrupo("GP-0001", "Sem Nada Pra Fazer", "Sem Nada Pra Fazer", "Fatinha de Sousa",
        //       converterStringParaDate("20/05/2014"), user);
        //System.out.println(gg.localizaGrupo("Sem Nada Pra Fazer"));
        //gg.excluirGrupo("Sem Nada Pra Fazer II");
    }
}
