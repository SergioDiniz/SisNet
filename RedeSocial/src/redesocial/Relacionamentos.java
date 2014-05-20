package redesocial;

/**
 *
 * @author Fatinha de Sousa
 */
public class Relacionamentos {

    private String tipo;
    private String status;

    public Relacionamentos(String tipo, String status) {
        this.tipo = tipo;
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
