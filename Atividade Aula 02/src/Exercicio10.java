import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();


        if (numero <= 1) {

            System.out.println("Não é primo");
        } else {

            boolean isPrimo = true;


            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {

                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println("Primo");
            } else {
                System.out.println("Não é primo");
            }
        }

    }
}
