import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de elementos:");
        int tamanho = scanner.nextInt();


        int[] numeros = new int[tamanho];


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número para a posição " + i + ":");
            numeros[i] = scanner.nextInt();
        }


        Arrays.sort(numeros);


        System.out.println("Números em ordem crescente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
