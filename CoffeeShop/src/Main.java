public class Main {
    public static void main(String[] args) {
        SistemaPedidos sistema = SistemaPedidos.getInstancia();

        Pedido pedido1 = new Pedido("cafe", new Pagamento.CartaoCredito());
        Pedido pedido2 = new Pedido("cha", new Pagamento.Dinheiro());
        Pedido pedido3 = new Pedido("mocha", new Pagamento.Dinheiro()); // bebida inválida

        sistema.processarPedido(pedido1);
        sistema.processarPedido(pedido2);
        sistema.processarPedido(pedido3);
    }
}
