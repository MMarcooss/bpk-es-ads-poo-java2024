package com.example.myjavafx;

import java.util.*;

public class AStar {
    private Estoque estoque;

    public AStar(Estoque estoque) {
        this.estoque = estoque;
    }

    public List<Produto> otimizarEstoque() {
        List<Produto> produtos = estoque.getProdutos();
        PriorityQueue<Node> openList = new PriorityQueue<>(Comparator.comparingDouble(node -> -node.valorTotal));
        List<Node> closedList = new ArrayList<>();

        Node root = new Node(new ArrayList<>(), 0, 0);
        openList.add(root);

        while (!openList.isEmpty()) {
            Node current = openList.poll();

            if (current.pesoAtual <= estoque.getCapacidade()) {
                closedList.add(current);

                for (Produto produto : produtos) {
                    if (!current.produtosSelecionados.contains(produto)) {
                        List<Produto> novosProdutos = new ArrayList<>(current.produtosSelecionados);
                        novosProdutos.add(produto);
                        double novoPeso = current.pesoAtual + produto.getPeso();
                        double novoValor = current.valorTotal + produto.getValor();

                        if (novoPeso <= estoque.getCapacidade()) {
                            openList.add(new Node(novosProdutos, novoPeso, novoValor));
                        }
                    }
                }
            }
        }

        return closedList.stream()
                .max(Comparator.comparingDouble(node -> node.valorTotal))
                .map(node -> node.produtosSelecionados)
                .orElse(Collections.emptyList());
    }
}
