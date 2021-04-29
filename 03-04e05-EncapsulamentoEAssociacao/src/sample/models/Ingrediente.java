package sample.models;

public class Ingrediente {
    //Criando atributos privados
    private String nome, medida;
    private double qtde;

    //Construtor para inicializar os atributos com dados providos
    public Ingrediente(String nome, String medida, double qtde) {
        this.nome = nome;
        this.medida = medida;
        this.qtde = qtde;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }

    //Sobrescrevendo o método ToString do java para printar os atributos
    @Override
    public String toString() {
        return "\n    Nome: " + nome + "\n" +
                "    Quantidade: " + qtde + " " + medida + "\n";
    }
}
