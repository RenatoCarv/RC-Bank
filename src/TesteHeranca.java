public class TesteHeranca {

    public static void main(String[] args) {

        Cliente renato = new Cliente("Renato", "12345678901");
        ContaCorrente cc = new ContaCorrente(1298, 8734, renato);

        cc.depositar(1000);
        cc.sacar(233.76);

        ContaPoupanca cp = new ContaPoupanca(1298, 4368, renato);

        cc.transferir(500, cp);
        cp.depositar(5000);


        System.out.println("O saldo da CC: " + cc.getSaldo());
        System.out.println("O saldo da CP: " + cp.getSaldo());



    }
}
