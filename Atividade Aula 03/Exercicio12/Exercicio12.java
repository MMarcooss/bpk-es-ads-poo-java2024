package Exercicio12;

public class Exercicio12 {
    public static void main(String[] args) {
        Filme theboys = new Filme("TheBoys", "Henry Cavil", "Tobey Magwire");
        System.out.println(theboys.getTitulo());

        theboys.IniciarFilme();
        theboys.Pararfilme();
    }
}
