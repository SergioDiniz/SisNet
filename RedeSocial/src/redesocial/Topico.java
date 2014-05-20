package redesocial;

import java.util.Calendar;
import java.util.ArrayList;
/**
 *
 * @author Fatinha de Sousa
 */
public class Topico {

    private String idTopico;
    private String descricao;
    private Calendar dataTopico;
    private ArrayList<ComentariosTopicos> comentarios;

    public Topico(String idTopico, String descricao, Calendar dataTopico, ArrayList<ComentariosTopicos> comentarios) {
        this.idTopico = idTopico;
        this.descricao = descricao;
        this.dataTopico = dataTopico;
        this.comentarios = comentarios;
    }

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

    public Calendar getDataTopico() {
        return dataTopico;
    }

    public void setDataTopico(Calendar dataTopico) {
        this.dataTopico = dataTopico;
    }

    public ArrayList<ComentariosTopicos> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<ComentariosTopicos> comentarios) {
        this.comentarios = comentarios;
    }
    
    
}
