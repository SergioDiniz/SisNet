package redesocial;

import java.util.Date;

/**
 *
 * @author Fatinha de Sousa
 */
public class SolicitacaoAmizade {

    private int id;
    private Usuario user;
    private Usuario user1;
    private String mensagem;
    private Date dataSolicitacao;

    public SolicitacaoAmizade() {
    }

    public SolicitacaoAmizade(int id, Usuario user, Usuario user1, String mensagem, Date dataSolicitacao) {
        this.id = id;
        this.user = user;
        this.user1 = user1;
        this.mensagem = mensagem;
        this.dataSolicitacao = dataSolicitacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Usuario getUser1() {
        return user1;
    }

    public void setUser1(Usuario user1) {
        this.user1 = user1;
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
    
    
}
