package redesocial;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Fatinha de Sousa
 */
public class Grupo {

    private String idGrupo;
    private String nome;
    private String descricao;
    private String nomeFundador;
    private Date dataCriacao;
    private Usuario criador;
    private ArrayList<Usuario> membros;
    private ArrayList<Topico> topicos;
    
    public Grupo(){
    
    }

    public Grupo(String idGrupo, String nome, String descricao, String nomeFundador, Date dataCriacao, Usuario criador,
            ArrayList<Usuario> membros, ArrayList<Topico> topicos) {
        this.idGrupo = idGrupo;
        this.nome = nome;
        this.descricao = descricao;
        this.nomeFundador = nomeFundador;
        this.dataCriacao = dataCriacao;
        this.criador = criador;
        this.membros = membros;
        this.topicos = topicos;
    }

    
    public String getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(String idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeFundador() {
        return nomeFundador;
    }

    public void setNomeFundador(String nomeFundador) {
        this.nomeFundador = nomeFundador;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Usuario getCriador() {
        return criador;
    }

    public void setCriador(Usuario criador) {
        this.criador = criador;
    }

    public ArrayList<Usuario> getMembros() {
        return membros;
    }

    public void setMembros(ArrayList<Usuario> membros) {
        this.membros = membros;
    }

    public ArrayList<Topico> getTopicos() {
        return topicos;
    }

    public void setTopicos(ArrayList<Topico> topicos) {
        this.topicos = topicos;
    }

    @Override
    public String toString() {
        return "Id Grupo: " + idGrupo + 
                "\nNome: " + nome + 
                "\nDescricao: " + descricao + 
                "\nFundador: " + nomeFundador+
                "\nData De Criacao: " +dataCriacao+
                "\nId Fundador: " +criador.getId();
    }  
}
