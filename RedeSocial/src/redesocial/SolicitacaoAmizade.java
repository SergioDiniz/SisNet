package redesocial;

import java.util.Date;

/**
 *
 * @author Fatinha de Sousa
 */
public class SolicitacaoAmizade {

    private int id;
    private Usuario remetente;
    private Usuario destinatario;
    private String mensagem;
    private Date dataSolicitacao;

    public SolicitacaoAmizade() {
    }

    public SolicitacaoAmizade(int id, Usuario user, Usuario user1, String mensagem, Date dataSolicitacao) {
        this.id = id;
        this.remetente = user;
        this.destinatario = user1;
        this.mensagem = mensagem;
        this.dataSolicitacao = dataSolicitacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public void setRemetente(Usuario user) {
        this.remetente = user;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario user1) {
        this.destinatario = user1;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    @Override
    public String toString() {
        return "Id: " + id + 
                "\nRemetente: " + remetente.getId() + 
                "\nDestinatario: " + destinatario.getId() + 
                "\nMensagem: " + mensagem + 
                "\nData da Solicitacao: " + dataSolicitacao;
    }   
}