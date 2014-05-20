package redesocial;

import java.util.Calendar;

/**
 *
 * @author Fatinha de Sousa
 */
public class Mensagem {

    private String idMensagem;
    private String conteudo;
    private Calendar dataEnvio;
    private Usuario remetente;
    private Usuario destinatario;

    public Mensagem(){
    
    }
    
    public Mensagem(String idMensagem, String conteudo, Calendar dataEnvio, Usuario remetente, Usuario
            destinatario) {
        this.idMensagem = idMensagem;
        this.conteudo = conteudo;
        this.dataEnvio = dataEnvio;
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    public String getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(String idMensagem) {
        this.idMensagem = idMensagem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Calendar getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Calendar dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String toString() {
        return "Id Mensagem: " + idMensagem + 
                "\nConteudo: " + conteudo + 
                "\nData de Envio: " + dataEnvio + 
                "\nRemetente: " + remetente.getNome() + 
                "\nDestinatario: " + destinatario.getNome();
    }
    
}
