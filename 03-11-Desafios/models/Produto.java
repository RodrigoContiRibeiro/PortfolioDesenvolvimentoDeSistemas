package sample.models;

public class Produto {
    //Atributos
    private String nome = "Não Informado";//Para evitar null
    private double preco;
    //Contrutor com os atributos
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    //Overload do construtor
    public Produto() {
        super();
    }
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Método toString sobrescrevendo o do java
    @Override
    public String toString() {
        return "\n         Nome: " + nome +
                "\n         Preco: R$" + preco + "\n";
    }
}
