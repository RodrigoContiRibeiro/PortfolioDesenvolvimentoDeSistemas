package sample.models;

public class Marca {
    //Atributos
    private String nome;
    private String descricao;
    //Construtor
    public Marca(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //Sobrescrita do método toString
    @Override
    public String toString() {
        return "\n  Nome: " + nome +
                "\n  Descricao: " + descricao;
    }
}
