
package redesocial;
import java.util.Calendar;

/**
 *
 * @author Fatinha de Sousa
 */
public class ComentariosTopicos {

    private String id;
    private String comentario;
    private Calendar dataComentario;

    public ComentariosTopicos() {
    }

    public ComentariosTopicos(String id, String comentario, Calendar data) {
        this.id = id;
        this.comentario = comentario;
        this.dataComentario = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public Calendar getDataComentario(){
        return dataComentario;
    }
    
    public void setDataComentario(Calendar data){
        this.dataComentario = data;
    }
}
