package Exercicio5;

public class Exercicio05 {
    public static void main(String[] args) {
        Cachorros viralata = new Cachorros("viralata", 22, "marcos");
        System.out.println(viralata.raca);

        viralata.latir();
        viralata.correr();
    }
}
