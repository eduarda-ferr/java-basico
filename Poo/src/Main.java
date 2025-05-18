public class Main{
    public static void main(String[] args) {

        Cliente fernando = new Cliente("Fernando");
        Conta corrente = new ContaCorrente(fernando);
        Conta poupanca = new ContaPoupanca(fernando);

        corrente.depositar(1200);
        corrente.transferir(400, poupanca);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
