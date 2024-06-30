public class TesteAbstract {
    public static void main(String[] args) {
        Cliente renato = new Cliente("Renato Carvalho", "12345678901");

        ContaCorrente cc = new ContaCorrente(1932, 3521, renato);
        ContaPoupanca cp = new ContaPoupanca(1932, 4325, renato);

        cc.gerarExtrato();
        cp.gerarExtrato();
    }
}
