package com.company.model;


/**
 *
 * classe Mangas criada para mesmo proposito q os animes (generos diferentes)
 * @version 1.0
 * @since 20/09/2020
 * @author Lucas Menezes
 *
 * */
/*
* versao 1.0 criada:
* classes criadas
* getters e setters criados
* ficou faltando getter e setters do TipoMangas pois nao tem enum feito ainda
* provavelmente será adicionada em um dia mais para frente.*/
public class Mangas {
    private String nome;
    private String url;
    private String sinopse;
    private int capitulo;
    private int volumes;
    private MangaTypes tipo;
    private float pontuacao;

    public Mangas(String nome, String url, String sinopse, int capitulo, int volumes, MangaTypes tipo, float pontuacao){
        this.nome = nome;
        this.url = url;
        this.sinopse = sinopse;
        this.capitulo = capitulo;
        this.volumes = volumes;
        this.tipo = tipo;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void getTodos(){
        System.out.println("Titulo: " + nome);
        System.out.println("Poster: " + url);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Capitulo: " + capitulo);
        System.out.println("Volumes: " + volumes);
        System.out.println("Tipos: " + tipo);
        System.out.println("Pontuação: " + pontuacao);
    }
}
