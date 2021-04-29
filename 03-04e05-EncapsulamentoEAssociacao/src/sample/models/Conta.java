package sample.models;

public class Conta {
    //Atributos privados
    private double saldo, limite;
    private int numeroConta;

    //Construtor para inicializar os atributos com dados providos
    public Conta(double saldo, double limite, int numeroConta) {
        this.saldo = saldo;
        this.limite = limite;
        this.numeroConta = numeroConta;
    }

    //Sobrecarga do construtor de Pessoa para deixar opcional o uso dele
    public Conta() {
        super();
    }

    //Método para deduzir um valor do atributo saldo, enquando o valor não estourar o limite
    public double sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Limite estourado ou Saldo insuficiente (" + valor + ").");
        }
        return this.saldo;
    }

    //Metódo para adicionar um valor ao atributo saldo, enquando ele for positivo
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Saldo: R$" + this.saldo);
        } else {
            System.out.println("Valor do depósito negativo (" + valor + ").");
        }
    }

    //Sobrescrevendo o método ToString do java para printar os atributos
    @Override
    public String toString() {
        return "Conta: \n" +
                "   Saldo: R$" + saldo + "\n" +
                "   Limite: R$" + limite + "\n" +
                "   Numero da Conta: " + numeroConta + "\n";
    }
}
