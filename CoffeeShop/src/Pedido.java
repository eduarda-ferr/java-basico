public class Pedido {
    private String tipoBebida;
    private Pagamento.PagamentoStrategy pagamento;

    public Pedido(String tipoBebida, Pagamento.PagamentoStrategy pagamento) {
        this.tipoBebida = tipoBebida;
        this.pagamento = pagamento;
    }

    public String getTipoBebida() {
        return tipoBebida;
    }

    public Pagamento.PagamentoStrategy getPagamento() {
        return pagamento;
    }
}
