package redesocial;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Fatinha de Sousa
 */
public class Usuario {

    private String id;
    private String nome;
    private String apelido;
    private String email;
    private String profissao;
    private String cidade;
    private String status;
    private Date dataNascimento;
    private String senha;
    private String foto;
    private ArrayList<LocaisMorou> locaisMorou;
    private ArrayList<LocaisEstudou> locaisEstudou;
    private ArrayList<Mensagem> mensagens;
    private ArrayList<Postagem> postagens;
    private ArrayList<Foto> fotos;
    private ArrayList<Grupo> grupos;
    private ArrayList<Topico> topicos;
    private ArrayList<Relacionamentos> relacionamentos;
    private ArrayList<ComentariosTopicos> comentariosTopicos;
    private ArrayList<ComentariosFotos> comentariosFotos;
    private ArrayList<SolicitacaoAmizade> solicitacoesAmizade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public ArrayList<LocaisMorou> getLocaisMorou() {
        return locaisMorou;
    }

    public void setLocaisMorou(ArrayList<LocaisMorou> locaisMorou) {
        this.locaisMorou = locaisMorou;
    }

    public ArrayList<LocaisEstudou> getLocaisEstudou() {
        return locaisEstudou;
    }

    public void setLocaisEstudou(ArrayList<LocaisEstudou> locaisEstudou) {
        this.locaisEstudou = locaisEstudou;
    }

    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(ArrayList<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    public ArrayList<Postagem> getPostagens() {
        return postagens;
    }

    public void setPostagens(ArrayList<Postagem> postagens) {
        this.postagens = postagens;
    }

    public ArrayList<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<Foto> fotos) {
        this.fotos = fotos;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public ArrayList<Topico> getTopicos() {
        return topicos;
    }

    public void setTopicos(ArrayList<Topico> topicos) {
        this.topicos = topicos;
    }

    public ArrayList<Relacionamentos> getRelacionamentos() {
        return relacionamentos;
    }

    public void setRelacionamentos(ArrayList<Relacionamentos> relacionamentos) {
        this.relacionamentos = relacionamentos;
    }

    public ArrayList<ComentariosTopicos> getComentariosTopicos() {
        return comentariosTopicos;
    }

    public void setComentariosTopicos(ArrayList<ComentariosTopicos> comentariosTopicos) {
        this.comentariosTopicos = comentariosTopicos;
    }

    public ArrayList<ComentariosFotos> getComentariosFotos() {
        return comentariosFotos;
    }

    public void setComentariosFotos(ArrayList<ComentariosFotos> comentariosFotos) {
        this.comentariosFotos = comentariosFotos;
    }  

    public ArrayList<SolicitacaoAmizade> getSolicitacoesAmizade() {
        return solicitacoesAmizade;
    }

    public void setSolicitacoesAmizade(ArrayList<SolicitacaoAmizade> solicitacoesAmizade) {
        this.solicitacoesAmizade = solicitacoesAmizade;
    }

    @Override
    public String toString() {
        return "Codigo: " + id + 
                "\nNome: " + nome + 
                "\nSenha: " + senha +
                "\nApelido: " + apelido + 
                "\nEmail: " + email + 
                "\nProfissao: " + profissao + 
                "\nCidade: " + cidade + 
                "\nStatus: " + status + 
                "\nData de Nascimento: " + dataNascimento + 
                "\nSenha: " + senha + 
                "\nFoto: " + foto;
    }
}