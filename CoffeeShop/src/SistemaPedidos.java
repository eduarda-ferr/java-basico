public class SistemaPedidos {
    private static SistemaPedidos instancia;

    private SistemaPedidos() {}

    public static SistemaPedidos getInstancia() {
        if (instancia == null) {
            instancia = new SistemaPedidos();
        }
        return instancia;
    }

    public void processarPedido(Pedido pedido) {
        Bebida.Bebida bebida = Bebida.BebidaFactory.criarBebida(pedido.getTipoBebida());
        if (bebida != null) {
            System.out.println("🧾 Pedido: " + bebida.getNome() + " | R$" + bebida.getPreco());
            pedido.getPagamento().pagar(bebida.getPreco());
        } else {
            System.out.println("❌ Bebida não encontrada: " + pedido.getTipoBebida());
        }
    }
}
