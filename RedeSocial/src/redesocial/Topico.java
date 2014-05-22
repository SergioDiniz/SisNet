package redesocial;

import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Fatinha de Sousa
 */
public class Topico {

    private String idTopico;
    private String descricao;
    private Date dataTopico;
    private Grupo grupo;
    private Usuario usuario;
    private ArrayList<ComentariosTopicos> comentarios;

    public Topico(String idTopico, String descricao, Date dataTopico, Usuario usuario, Grupo grupo,
            ArrayList<ComentariosTopicos> comentarios) {
        this.idTopico = idTopico;
        this.descricao = descricao;
        this.dataTopico = dataTopico;
        this.grupo = grupo;
        this.usuario = usuario;
        this.comentarios = comentarios;
    }
    
    public Topico(){}

    public String getIdTopico() {
        return idTopico;
    }

    public void setIdTopico(String idTopico) {
        this.idTopico = idTopico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataTopico() {
        return dataTopico;
    }

    public void setDataTopico(Date dataTopico) {
        this.dataTopico = dataTopico;
    }

    public ArrayList<ComentariosTopicos> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<ComentariosTopicos> comentarios) {
        this.comentarios = comentarios;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Id Topico: " + idTopico + 
                "\nDescricao: " + descricao + 
                "\nData de Criação: " + dataTopico + 
                "\nGrupo: " + grupo.getIdGrupo() + 
                "\nUsuario: " + usuario.getId();
    }
}
