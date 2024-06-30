public class Teste {
    public static void main(String[] args) {

        Cliente renato = new Cliente("Renato", "12345678990");
        ContaCorrente cc = new ContaCorrente(5643, 10032, renato);
        ContaPoupanca cp = new ContaPoupanca(5643, 8721, renato);

        cc.depositar(1000);
        cp.depositar(10000);
        cp.transferir(500, cc);

        try {
            cc.sacar(1000);
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        cp.sacar(1000);
        cc.transferir(100, cp);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

    }
}
