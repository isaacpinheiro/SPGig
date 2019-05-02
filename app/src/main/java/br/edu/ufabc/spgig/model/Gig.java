package br.edu.ufabc.spgig.model;

import java.util.Date;

public class Gig {

    private Long id;
    private String nome;
    private String descricao;
    private String tipo;
    private String preco;
    private Date dataInicio;
    private Date dataFim;
    private Date horarioInicio;
    private Date horarioFim;
    private String endereco;
    private String complemento;
    private String cidade;
    private String cep;
    private String estado;
    private String siteEvento;
    private String siteIngresso;
    private String imagemGig;
    private String imagens;
    private Organizador organizador;

    public Gig() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(Date horarioFim) {
        this.horarioFim = horarioFim;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSiteEvento() {
        return siteEvento;
    }

    public void setSiteEvento(String siteEvento) {
        this.siteEvento = siteEvento;
    }

    public String getSiteIngresso() {
        return siteIngresso;
    }

    public void setSiteIngresso(String siteIngresso) {
        this.siteIngresso = siteIngresso;
    }

    public String getImagemGig() {
        return imagemGig;
    }

    public void setImagemGig(String imagemGig) {
        this.imagemGig = imagemGig;
    }

    public String getImagens() {
        return imagens;
    }

    public void setImagens(String imagens) {
        this.imagens = imagens;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

}
