public class ItemPedido {
    private Prato prato;
    private int quantidade;

    public ItemPedido(Prato prato, int quantidade) {
        this.prato = prato;
        this.quantidade = quantidade;
    }

    public Prato getPrato() {
        return prato;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularValorTotal() {
        return prato.getPreco() * quantidade;
    }
}
