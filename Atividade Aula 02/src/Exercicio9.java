import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int result = 0;

        System.out.println("Digite o 1 numero");
        int num1 = scanner.nextInt();

        System.out.println("Digite o 2 numero");
        int num2 = scanner.nextInt();

        System.out.println("Escolha a operação desejada");
        System.out.println("1 - Soma ");
        System.out.println("2 - Subtracao");
        System.out.println("3 - multiplicar ");
        System.out.println("4 - dividir ");
        int op = scanner.nextInt();

        switch (op){

            case 1:
                result = num1 + num2;

                break;

            case 2:
               result = num1 - num2;

                break;

            case 3:
                result = num1 * num2;

                break;

                case 4:

                 result = num1 / num2;

                break;

            default:

                System.out.println("Operacao invalida");

        }

        System.out.println("Resulta e " + result);
    }
}
