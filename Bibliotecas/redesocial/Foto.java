package redesocial;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Fatinha de Sousa
 */
public class Foto {
    
    private String idFoto;
    private String titulo;
    private String caminho;
    private Date dataPostagem;
    private Usuario usuario;
    private ArrayList<ComentariosFotos> comentarios;
    
    public Foto(){
    
    }

    public Foto(String idFoto, String titulo, String caminho, Date dataPostagem, Usuario dono, ArrayList<ComentariosFotos> comentarios) {
        this.idFoto = idFoto;
        this.titulo = titulo;
        this.caminho = caminho;
        this.dataPostagem = dataPostagem;
        this.usuario = dono;
        this.comentarios = comentarios;
    }
    
    public String getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(String idFoto) {
        this.idFoto = idFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
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

    public ArrayList<ComentariosFotos> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<ComentariosFotos> comentarios) {
        this.comentarios = comentarios;
    }
    
    
}
