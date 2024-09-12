import com.rc.banco.exception.SaldoInsuficienteException;
import com.rc.banco.model.Cliente;
import com.rc.banco.model.ContaCorrente;
import com.rc.banco.model.ContaPoupanca;

public static void main(String[] args) {

    Cliente renato = new Cliente("Renato", "11712852485");
    ContaCorrente conta = new ContaCorrente(0001, 123, renato);

    Cliente Yago = new Cliente("Yago", "12712852465");
    ContaPoupanca conta1 = new ContaPoupanca(0001, 124, renato);

    conta.depositar(90);

    try {
        conta.sacar(100);
    } catch (SaldoInsuficienteException e){
        System.out.println(e.getMessage());
    }


    System.out.println("Conta de Renato: " + conta.getSaldo());
    System.out.println("Conta de Yago: " + conta1.getSaldo());

}
