import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu para o usuário
        System.out.println("Escolha a conversão desejada:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        // Lê a escolha do usuário
        int opcao = scanner.nextInt();

        // Variável para armazenar a temperatura inserida pelo usuário
        double temperatura;

        switch (opcao) {
            case 1:
                // Conversão de Celsius para Fahrenheit
                System.out.println("Digite a temperatura em Celsius:");
                temperatura = scanner.nextDouble();
                double fahrenheit = celsiusParaFahrenheit(temperatura);
                System.out.println(temperatura + " Celsius é igual a " + fahrenheit + " Fahrenheit.");
                break;

            case 2:
                // Conversão de Fahrenheit para Celsius
                System.out.println("Digite a temperatura em Fahrenheit:");
                temperatura = scanner.nextDouble();
                double celsius = fahrenheitParaCelsius(temperatura);
                System.out.println(temperatura + " Fahrenheit é igual a " + celsius + " Celsius.");
                break;

            default:
                // Opção inválida
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                break;
        }

        scanner.close();
    }

    // Método para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método para converter Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
