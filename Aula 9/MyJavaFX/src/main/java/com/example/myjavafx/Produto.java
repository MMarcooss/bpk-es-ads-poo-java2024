package com.example.myjavafx;

public class Produto {
    private String nome;
    private double peso;
    private double valor;

    public Produto(String nome, double peso, double valor) {
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }
}
