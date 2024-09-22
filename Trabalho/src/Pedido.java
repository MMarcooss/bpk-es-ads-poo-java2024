import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private List<ItemPedido>itens;

    public Pedido(Cliente cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.itens = new ArrayList<>();
    }

    public void adicionaritem(ItemPedido item){
        itens.add(item);
    }

    public void removeritem(ItemPedido item){
        itens.remove(item);
    }

    public double calcularTotal () {
    double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubTotal();
        }
        return total;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public  void  comandada () {
        System.out.println("Pedido numero: " + numero);
        System.out.println("Cliente: " + cliente.getNome() + " Endereço: " + cliente.getEndereco());
        System.out.println("Endereço de Entrega: " + cliente.getEndereco());
        System.out.println("Itens:");
        for (ItemPedido item : itens) {
            System.out.println("- " + item);
        }
        System.out.printf("Total: R$ %.2f%n", calcularTotal());
    }
}


