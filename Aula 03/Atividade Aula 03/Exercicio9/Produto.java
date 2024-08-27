package Exercicio9;

import java.util.Scanner;

public class Produto {
    public String nome;
    public float preco;
    public int qtde;


    public Produto(String nome, int qtde, float preco) {
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }


    public float getPreco() {
        return preco;
    }


    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            qtde += quantidade;
            System.out.println("Estoque aumentado. Novo estoque: " + qtde);
        } else {
            System.out.println("Quantidade inválida para aumentar o estoque.");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtde=" + qtde +
                '}';
    }
}
