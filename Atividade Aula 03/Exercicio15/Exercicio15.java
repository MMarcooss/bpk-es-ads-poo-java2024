package Exercicio15;

public class Exercicio15 {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo(20.00, "Terror","Minhavida");

        System.out.println(jogo1.nome);

        jogo1.IniciarJ();
        jogo1.PausarJ();
    }
}
