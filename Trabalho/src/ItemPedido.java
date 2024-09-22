public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularSubTotal(){

       return produto.getPreco() * quantidade;
    }
    @Override
    public String toString() {
        return String.format("%s %d  R$ %.2f = R$ %.2f",
                produto.getNome(),
                quantidade,
                produto.getPreco(),

               calcularSubTotal());
    }
}
