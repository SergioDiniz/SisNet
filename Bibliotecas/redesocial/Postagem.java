package redesocial;

import java.util.Calendar;
/**
 *
 * @author Fatinha de Sousa
 */
public class Postagem {

    private String idPostagem;
    private String conteudo;
    private Calendar dataPostagem;

    public Postagem(String idPostagem, String conteudo, Calendar dataPostagem) {
        this.idPostagem = idPostagem;
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;
    }
    
    public Postagem(){
    
    }

    public String getIdPostagem() {
        return idPostagem;
    }

    public void setIdPostagem(String idPostagem) {
        this.idPostagem = idPostagem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Calendar getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(Calendar dataPostagem) {
        this.dataPostagem = dataPostagem;
    }
    
    
}
