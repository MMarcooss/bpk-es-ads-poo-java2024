public class Main {
    public static void main(String[] args) {
        

        Prato prato1 = new Prato("Pizza Margherita", "Massa fina com tomate e manjericão", 25.00);
        Prato prato2 = new Prato("Lasanha", "Lasanha à bolonhesa", 30.00);


        Cliente cliente = new Cliente("João Silva", "joao@email.com");


        Pedido pedido = new Pedido(cliente);


        pedido.adicionarItem(new ItemPedido(prato1, 2));
        pedido.adicionarItem(new ItemPedido(prato2, 1));


        System.out.println(pedido.gerarRelatorio());
    }
}
