package com.company.model;

public class Aula {
    private String titulo;
    private String duracao;
    private String categoria;

    public Aula(String titulo, String duracao, String categoria) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
