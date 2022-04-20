package com.company.model;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Aula> aulas;
    private double preco;
    private String dataLancamento;
    private String categoria;

    public Curso(String nome, ArrayList<Aula> aulas, double preco, String dataLancamento, String categoria) {
        this.nome = nome;
        this.aulas = aulas;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
