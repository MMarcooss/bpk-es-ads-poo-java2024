package com.example.myjavafx;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private double capacidade;
    private List<Produto> produtos;

    public Estoque(double capacidade) {
        this.capacidade = capacidade;
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getCapacidade() {
        return capacidade;
    }
}
