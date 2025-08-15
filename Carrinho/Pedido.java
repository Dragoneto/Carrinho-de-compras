package com.ecommerce.model;

import java.util.List;

public class Pedido {
    private int id;
    private Usuario usuario;
    private List<Produto> produtos;

    public Pedido(int id, Usuario usuario, List<Produto> produtos) {
        this.id = id;
        this.usuario = usuario;
        this.produtos = produtos;
    }

    // Getters
    public int getId() { return id; }
    public Usuario getUsuario() { return usuario; }
    public List<Produto> getProdutos() { return produtos; }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", usuario=" + usuario.getNome() +
                ", total=" + calcularTotal() +
                '}';
    }
}
