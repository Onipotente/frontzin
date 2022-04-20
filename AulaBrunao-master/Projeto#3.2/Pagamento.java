package com.company.model;

public class Pagamento {
    private String metodoPagamento;
    private String precoTotal;
    private Usuario usuario;

    public Pagamento(String metodoPagamento, String precoTotal, Usuario usuario) {
        this.metodoPagamento = metodoPagamento;
        this.precoTotal = precoTotal;
        this.usuario = usuario;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(String precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
