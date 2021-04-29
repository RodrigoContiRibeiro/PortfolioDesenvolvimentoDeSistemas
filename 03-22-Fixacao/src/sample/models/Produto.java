package sample.models;

public class Produto {
    //Atribuots
    private String nome;
    private double preco;
    //Construtor sobrecarregado
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

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
    //ToString sobrescrito
    @Override
    public String toString() {
        return "\n  Nome: " + nome +
                "\n  Preço: R$" + preco + "\n";
    }
}
