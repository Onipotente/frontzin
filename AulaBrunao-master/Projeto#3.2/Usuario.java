package com.company.model;

public class Usuario {
    private String nome;
    private String sobrenome;
    private String dtNascimento;
    private Endereco endereco;
    private String email;
    private String telefone;

    public Usuario(String nome, String sobrenome, String dtNascimento, Endereco enderec, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dtNascimento = dtNascimento;
        this.endereco = enderec;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Endereco getEnderec() {
        return endereco;
    }

    public void setEnderec(Endereco enderec) {
        this.endereco = enderec;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
