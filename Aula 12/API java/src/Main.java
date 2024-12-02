import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Celular",500 ));
        produtos.add(new Produto("Celular2",50 ));
        produtos.add(new Produto("Celular3",1500 ));
        produtos.add(new Produto("Celular3",15000 ));
        produtos.add(new Produto("Celular4",100 ));

        List<Produto> produtosFIltrados = produtos.stream().filter(produto -> produto.getPreco() >= 1000)
                .distinct()
                .toList();
            


        System.out.println(produtos.size());

        System.out.println(produtosFIltrados.size());

        produtosFIltrados.forEach(p -> System.out.println(p));

    }
}