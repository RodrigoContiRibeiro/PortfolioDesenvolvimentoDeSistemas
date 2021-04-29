package sample.models;

public class Cliente {
    //Atributos privados
    private String nome, cpf;
    //Cliente possui uma instancia da classe Conta, pois estão associadas
    private Conta conta;

    //Construtor para inicializar os atributos com dados providos
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Sobrecarga do construtor de Pessoa para deixar opcional o uso dele
    public Cliente() {
        super();
    }


    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    //Sobrecarregando o setter da instancia de Conta para imitar o comportamento de um construtor
    public void setConta(double saldo, double limite, int numeroConta) {
        Conta contaNew = new Conta(saldo, limite, numeroConta);
        setConta(contaNew);
    }

    //Sobrescrevendo o método ToString do java para printar os atributos
    @Override
    public String toString() {
        return "Cliente: \n" +
                "Nome: " + this.getNome() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                this.getConta() + "\n";
    }
}
