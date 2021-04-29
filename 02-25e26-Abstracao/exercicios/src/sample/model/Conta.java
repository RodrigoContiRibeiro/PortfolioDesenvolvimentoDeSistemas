package sample.model;

public class Conta {
    //Atributos
    String agenciaNum;
    String contaNum;
    double saldo;

    //Construtor para inicializar os atributos com valores providos
    public Conta(String agencia, String conta) {
        this.agenciaNum = agencia;
        this.contaNum = conta;
        this.saldo = 1000;
    }
    
    //Método para printar as informações do extrato
    public void getExtrato() {
        System.out.println("==========EXTRATO==========");
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Agência: " + this.agenciaNum);
        System.out.println("Conta: " + this.contaNum);
        System.out.println("==========EXTRATO==========" + "\n");
    }

    //Método para deduzir um valor do atributo saldo, verificando se o o atributo ficará negativo
    //E Printando
    public void sacar(double qtndSaque) {
        System.out.println("==========SAQUE==========");
        boolean isWithdrawnPossible = this.saldo < qtndSaque;
        if (!isWithdrawnPossible) {
            System.out.println("Saldo Anterior: R$" + this.saldo);
            this.saldo -= qtndSaque;
            System.out.println("Saque: R$" + qtndSaque);
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo Atual: R$" + this.saldo);
        System.out.println("==========SAQUE==========" + "\n");
    }

    //Método para aumentar o valor do atributo saldo, desde que o valor seja maior que 0 
    //E Printando
    public void depositar(double qtndDeposito) {
        if (qtndDeposito > 0) {
            System.out.println("==========DEPÓSITO==========");
            System.out.println("Saldo Anterior: R$" + this.saldo);
            System.out.println("Depósito: R$" + qtndDeposito);
            this.saldo += qtndDeposito;
            System.out.println("Saldo Atual: R$" + this.saldo);
            System.out.println("==========DEPÓSITO==========" + "\n");
        }
    }
}
