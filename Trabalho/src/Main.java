public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Maça",30.00);
        Produto produto2 = new Produto("Peixe",20.00);

        Cliente cliente1 = new Cliente("Marcos",
                new Endereco("Rua Foda", "Estadofoda", true, "12345-678", "123", "toledo"));
        Cliente cliente2 = new Cliente("Joao",
                new Endereco("Rua Foda2", "Antagorda",false,"97654-432","321","toledo"));

        Pedido pedido1 = new Pedido(cliente1,2);

        ItemPedido item1 = new ItemPedido(produto1,2);

        pedido1.adicionaritem(item1);

        pedido1.comandada();
    }
}
