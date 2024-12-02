import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int A = scanner.nextInt();

             int resultadoIterativo = fatorialIterativa(A);
        System.out.println("Fatorial iterativo de " + A + " é: " + resultadoIterativo);

             int resultadoRecursivo = fatorialRecursivo(A);
        System.out.println("Fatorial recursivo de " + A + " é: " + resultadoRecursivo);

        scanner.close();
    }
    public static int fatorialIterativa(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int fatorialRecursivo(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fatorialRecursivo(num - 1);
        }
    }
}
