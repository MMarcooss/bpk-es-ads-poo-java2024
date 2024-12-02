import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um palavra:");
        String palavra = scanner.nextLine();

        int numerovogais = contadora (palavra);
        //int numerovogais = contadora(palavra);


        System.out.println("O numero de vogais e: " + numerovogais);
    }

    public static int contadora(String texto) {

        int contadora = 0;

        for (int i = 0;i<texto.length();i++){
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contadora++;
            }
        }
        return contadora;
    }
}
