import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um numero inteiro:");
        int A = Integer.parseInt(scanner.nextLine());

        if (A % 2 == 0){
            System.out.printf("Par");

        }else {System.out.printf("Impar");
        }
    }
}
