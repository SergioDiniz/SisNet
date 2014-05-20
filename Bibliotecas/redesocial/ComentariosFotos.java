
package redesocial;

import java.util.Calendar;
/**
 *
 * @author Fatinha de Sousa
 */
public class ComentariosFotos {

    private String idComentario;
    private String comentario;
    private Calendar dataComentarios;

    public ComentariosFotos(String idComentario, String comentario, Calendar dataComentarios) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.dataComentarios = dataComentarios;
    }

    public ComentariosFotos() {
    }

    public String getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(String idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Calendar getDataComentarios() {
        return dataComentarios;
    }

    public void setDataComentarios(Calendar dataComentarios) {
        this.dataComentarios = dataComentarios;
    }
    
    
}
