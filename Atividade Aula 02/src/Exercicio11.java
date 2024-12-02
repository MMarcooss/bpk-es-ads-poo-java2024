import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        boolean palindromo = true;
        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine();

        for (int i = 0; i < palavra.length() / 2; i++) {
            if ((palavra).toLowerCase().charAt(i) != (palavra).toLowerCase().charAt(palavra.length() - 1 - i))
            {
                palindromo = false;
                break;
            }
        }

        if(palindromo == true)
        {
            System.out.println("A palavra " + palavra + " é um palíndromo!");
        }
        else
        {
            System.out.println("A palavra " + palavra + " não é um palíndromo!");
        }
    }
}