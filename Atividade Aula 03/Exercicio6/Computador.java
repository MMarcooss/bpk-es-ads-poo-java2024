package Exercicio6;

public class Computador {
    public String processador;
    public int memoria;
    public float armazenamento;

    public Computador(float armazenamento, int memoria, String processador) {
        this.armazenamento = armazenamento;
        this.memoria = memoria;
        this.processador = processador;
    }

    public void ligar() {
        System.out.println(" esta ligando");
    }

    public void desligar() {
        System.out.println(" esta desligando");
    }
}


