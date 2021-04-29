package sample.models;

public abstract class Pessoa {
    //Atributos com a classe Endereco como atributo
    private String nome;
    private Endereco endereco;

    //Construtores sobrecarregados para diferentes valores
    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //Setter de Endereco com os valores de seu construtor
    public void setEndereco(String rua, String bairro, String cep, int numero) {
        this.endereco = new Endereco(rua, bairro, cep, numero);
    }
    //Sobrecarga do método toString
    @Override
    public String toString() {
        return
                "\n    Endereco: " + "  " + endereco;
    }
}
