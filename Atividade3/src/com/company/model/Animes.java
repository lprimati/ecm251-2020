package com.company.model;
/**
 *
 * Classe anime criada e construida, até a parte dos getters e setters
 * @version 1.0
 * @since 20/09/2020
 * @author Lucas Menezes
 * */
public class Animes {
    private String nome;
    private String url;
    private String sinopse;
    private int episodios;
    private float pontuacao;


    public Animes(String nome, String url, String sinopse, int episodios, float pontuacao){
        this.nome = nome;
        this.url = url;
        this.sinopse = sinopse;
        this.episodios = episodios;
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

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
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
        System.out.println("Episodios: " + episodios);
        System.out.println("Pontuaçao: " + pontuacao);
    }
}
