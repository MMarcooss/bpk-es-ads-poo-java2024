import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private LocalDate data;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        return itens.stream().mapToDouble(ItemPedido::calcularValorTotal).sum();
    }

    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Pedido do Cliente: ").append(cliente.getNome()).append("\n");
        relatorio.append("Data: ").append(data).append("\n");
        relatorio.append("Itens do Pedido:\n");

        for (ItemPedido item : itens) {
            relatorio.append("- ").append(item.getQuantidade()).append(" x ")
                    .append(item.getPrato().getNome()).append(" (")
                    .append(item.getPrato().getPreco()).append(" cada) = ")
                    .append(String.format("%.2f", item.calcularValorTotal())).append("\n");
        }

        relatorio.append("Valor Total: ").append(String.format("%.2f", calcularValorTotal()));
        return relatorio.toString();
    }
}
