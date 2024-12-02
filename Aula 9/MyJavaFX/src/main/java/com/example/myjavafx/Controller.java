package com.example.myjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nomeField;
    @FXML
    private TextField pesoField;
    @FXML
    private TextField valorField;
    @FXML
    private TextArea resultadoArea;

    private Estoque estoque;

    public Controller() {
        estoque = new Estoque(100.0); // Define a capacidade do estoque
    }

    @FXML
    public void adicionarProduto() {
        String nome = nomeField.getText();
        double peso = Double.parseDouble(pesoField.getText());
        double valor = Double.parseDouble(valorField.getText());
        estoque.cadastrarProduto(new Produto(nome, peso, valor));

        resultadoArea.appendText("Produto adicionado: " + nome + "\n");
        nomeField.clear();
        pesoField.clear();
        valorField.clear();
    }

    @FXML
    public void otimizarEstoque() {
        AStar aStar = new AStar(estoque);
        var produtosOtimizados = aStar.otimizarEstoque();

        resultadoArea.appendText("Produtos Otimizados:\n");
        for (Produto produto : produtosOtimizados) {
            resultadoArea.appendText(produto.getNome() + " (Peso: " + produto.getPeso() + ", Valor: " + produto.getValor() + ")\n");
        }
    }
}
