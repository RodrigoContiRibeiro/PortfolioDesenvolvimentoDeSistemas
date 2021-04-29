package sample;

import sample.models.Cliente;
import sample.models.Conta;

public class ContaPessoaMain {
    public static void main(String[] args) {
    	//Instanciando a classe Conta com o construtor, chamando os seus métodos e printando ela
        Conta conta = new Conta(1000, 500, 12345);
        conta.sacar(1500);
        System.out.println("Saldo: R$" + conta.sacar(500));
        conta.depositar(-10);
        conta.depositar(100);
        System.out.println(conta.toString());

	//Instanciando a classe Cliente com o construtor, associando um objeto de Conta a ele e printando
        Cliente cliente1 = new Cliente("Rodrigo", "123456789");
        cliente1.setConta(conta);
        System.out.println(cliente1.toString());
        //Alterando os atributos da instancia de Cliente e printando para ver as alterações
        cliente1.setNome("Rodrigo CR");
        cliente1.setCpf("1011121314");
        System.out.println(cliente1.toString());

	//Instanciando a classe Conta com o construtor, e criando um objeto de Conta usando um setter
        Cliente cliente2 = new Cliente("Claudio", "987654321");
        //Usando um setter que imita um construtor e printando
        cliente2.setConta(2000, 500, 54321);
        System.out.println(cliente2.toString());
        //Alterando os atributos da instancia de Cliente e printando para ver as alterações
        cliente2.setNome("Claudio CR");
        cliente2.setCpf("2021222324");
        System.out.println(cliente2.toString());
    }
}
