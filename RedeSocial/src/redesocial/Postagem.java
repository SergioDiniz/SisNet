package redesocial;

import java.util.Date;
/**
 *
 * @author Fatinha de Sousa
 */
public class Postagem {

    private String idPostagem;
    private String conteudo;
    private Date dataPostagem;
    private Usuario usuario;

    public Postagem(String idPostagem, String conteudo, Date dataPostagem, Usuario usuario) {
        this.idPostagem = idPostagem;
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;
        this.usuario = usuario;
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

    public Date getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(Date dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Id Postagem: " + idPostagem + 
                "\nConteudo: " + conteudo + 
                "\nData Postagem: " + dataPostagem + 
                "\nUsuario: " + usuario.getId();
    }
}