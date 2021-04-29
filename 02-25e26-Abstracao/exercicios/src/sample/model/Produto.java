package sample.model;

public class Produto {
    //Atributos
    String nome;
    double preco;

    //Construtor para inicializar os atributos com valores providos
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Getters & Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //ToString para printar
    public String toString() {
        return "\nProduto: " + this.nome + " Preço: R$" + this.preco;
    }

}
