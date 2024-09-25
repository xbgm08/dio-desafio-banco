import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Gabriel");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        List<Conta> contaList = new ArrayList<>();
        contaList.add(cc);
        contaList.add(cp);

        Banco banco = new Banco();
        banco.setNome("Santander");
        banco.setContas(contaList);
        banco.imprimirContas();
    }
}
