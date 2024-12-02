package Exercicio11;

public class Exercicio11 {
    public static void main(String[] args) {
        Cidade cidade1 = new Cidade ("Toledo", "Parana", 20000);
        System.out.println(cidade1);

        cidade1.aumentarPopulacao(500000);
        System.out.println("Apos aumentar a população:");
        cidade1.exibirInformacoes();

        cidade1.diminuirPopulacao(300000);
        System.out.println("Após diminuir a população:");
        cidade1.exibirInformacoes();

    }
}
