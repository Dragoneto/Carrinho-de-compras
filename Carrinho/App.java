package com.ecommerce;

import com.ecommerce.model.*;
import com.ecommerce.service.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        Usuario usuario = new Usuario(1, "Davi Almeida", "davi@email.com", "1234");

        Produto p1 = new Produto(1, "Notebook", 4500.0, 10);
        Produto p2 = new Produto(2, "Mouse", 120.0, 50);

        produtoService.adicionarProduto(p1);
        produtoService.adicionarProduto(p2);

        System.out.println("Produtos disponíveis:");
        produtoService.listarProdutos().forEach(System.out::println);

        Pedido pedido = new Pedido(1, usuario, Arrays.asList(p1, p2));
        System.out.println("\nPedido realizado:");
        System.out.println(pedido);
    }
}
