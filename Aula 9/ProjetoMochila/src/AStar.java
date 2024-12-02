import java.util.*;

public class AStar {
    private Estoque estoque;

    public AStar(Estoque estoque) {
        this.estoque = estoque;
    }

    public List<Produto> otimizarEstoque() {
        List<Produto> produtos = estoque.getProdutos();
        PriorityQueue<OtimizarEstoque> openList = new PriorityQueue<>(Comparator.comparingDouble(otimizarEstoque -> -otimizarEstoque.valorTotal));
        List<OtimizarEstoque> closedList = new ArrayList<>(); // Mudei para ArrayList para manter referências a Nodes

        OtimizarEstoque root = new OtimizarEstoque(new ArrayList<>(), 0, 0);
        openList.add(root);

        while (!openList.isEmpty()) {
            OtimizarEstoque current = openList.poll();

            if (current.pesoAtual <= estoque.getCapacidade()) {
                closedList.add(current); // Armazena o OtimizarEstoque atual

                for (Produto produto : produtos) {
                    if (!current.produtosSelecionados.contains(produto)) { // Evita repetir produtos
                        List<Produto> novosProdutos = new ArrayList<>(current.produtosSelecionados);
                        novosProdutos.add(produto);
                        double novoPeso = current.pesoAtual + produto.getPeso();
                        double novoValor = current.valorTotal + produto.getValor();

                        if (novoPeso <= estoque.getCapacidade()) {
                            openList.add(new OtimizarEstoque(novosProdutos, novoPeso, novoValor));
                        }
                    }
                }
            }
        }

        // Recuperar o OtimizarEstoque com o maior valor total
        return closedList.stream()
                .max(Comparator.comparingDouble(otimizarEstoque -> otimizarEstoque.valorTotal))
                .map(otimizarEstoque -> otimizarEstoque.produtosSelecionados) // Retorna os produtos do OtimizarEstoque com maior valor total
                .orElse(Collections.emptyList());
    }
}
