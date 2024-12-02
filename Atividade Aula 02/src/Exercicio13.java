import java.util.Random;
import java.util.Scanner;

public class Exercicio13{
    public static void main(String[] args) {

        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;//random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int tentativa;
        int contadorTentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Eu escolhi um número entre 1 e 100. Tente adivinhar qual é.");


        do {

            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            contadorTentativas++;


            if (tentativa < numeroSecreto) {
                System.out.println("O número secreto é maior que " + tentativa + ".");
            } else if (tentativa > numeroSecreto) {
                System.out.println("O número secreto é menor que " + tentativa + ".");
            } else {
                System.out.println("Parabéns! Você adivinhou o número em " + contadorTentativas + " tentativas.");
            }
        } while (tentativa != numeroSecreto);


        scanner.close();
    }
}
