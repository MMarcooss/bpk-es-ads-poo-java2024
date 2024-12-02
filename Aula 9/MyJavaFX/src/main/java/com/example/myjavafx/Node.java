package com.example.myjavafx;

import java.util.List;

public class Node {
    public List<Produto> produtosSelecionados;
    public double pesoAtual;
    public double valorTotal;

    public Node(List<Produto> produtosSelecionados, double pesoAtual, double valorTotal) {
        this.produtosSelecionados = produtosSelecionados;
        this.pesoAtual = pesoAtual;
        this.valorTotal = valorTotal;
    }
}
