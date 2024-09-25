import lombok.*;

import java.util.List;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;

    public void imprimirContas(){
        System.out.println(String.format("=== Contas dos Clientes %s ===", this.nome));
        for(Conta conta : this.contas){
            System.out.println(String.format("Titular: %s", conta.cliente.getNome()));
            System.out.println(String.format("Agencia: %d", conta.agencia));
            System.out.println(String.format("Numero: %d", conta.numero));
            System.out.println();
        }
    }
}
