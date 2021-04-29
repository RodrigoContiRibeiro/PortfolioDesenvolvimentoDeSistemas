package sample;

import sample.model.Conta;

public class ContaMain {
    public static void main(String[] args) {
        //Instanciando a classe Conta e executando os seus métodos
        Conta conta = new Conta("1234-56", "12345678");
        conta.getExtrato();
        conta.sacar(200);
        conta.depositar(300);
        conta.getExtrato();
    }
}
