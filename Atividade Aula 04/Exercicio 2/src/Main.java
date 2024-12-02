import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro A", "123456789", "Autor 1");
        Livro livro2 = new Livro("Livro B", "987654321", "Autor 1");

        List<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);

        Autor auto1 = new Autor(livro1,"europeu","marcos");


    }
}