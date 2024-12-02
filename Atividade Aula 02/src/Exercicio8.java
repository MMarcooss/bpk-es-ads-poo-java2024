import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite sua idade:");

        int idade = Integer.parseInt(scanner.nextLine());

        System.out.printf("Digite sueu nome:");
        String nome = scanner.nextLine();

        System.out.println("Sua idade e " + idade);
        System.out.println("Sua nome e " +  nome);


    }

}
