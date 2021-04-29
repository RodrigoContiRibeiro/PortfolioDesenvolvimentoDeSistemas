package sample.models;

import java.util.ArrayList;

public class Receita {
    //Criando atributos privados
    private String nome, descricao;
    //Criando uma lista como atributo para armazenar instancias de Ingrediente, pois estão associados
    private ArrayList<Ingrediente> ingredientes;

    //Construtor para inicializar os atributos com dados providos
    public Receita(String nome, String descricao, ArrayList<Ingrediente> ingredientes) {
        this.nome = nome;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
    }
    //Getters & Setters
    public ArrayList<Ingrediente> getIngredientes(){
        return this.ingredientes;
    }

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

    //Sobrescrevendo o método ToString do java para printar os atributos
    @Override
    public String toString() {
        return "Receita: \n" +
                "Nome: " + nome + "\n" +
                "Descrição: " + descricao + "\n" +
                "Ingredientes: \n" + ingredientes + "\n";
    }
}
