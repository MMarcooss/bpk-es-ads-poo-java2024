import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int A = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o segundo número: ");
        int B = Integer.parseInt(scanner.nextLine());

        int soma = B + A;
        int sub = B - A;
        int div = B / A;
        int multi = B * A;

        System.out.println("A soma dos números é " + soma);
        System.out.println("A subtração dos números é " + sub);
        System.out.println("A divisão dos números é " + div);
        System.out.println("A multiplicação dos números é " + multi);
    }
}