package sample.models.ex2;

public abstract class Pessoa {
    //Atributos
    private String nome;
    //SObrecarga do construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }
    //Getter & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //ToString sobrecarregado
    @Override
    public String toString() {
        return "Pessoa: " +
                (nome != null ? "\nNome: " + nome : "");

    }
}
