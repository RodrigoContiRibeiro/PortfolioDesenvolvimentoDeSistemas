package sample.models;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private Contato contato;

    public Pessoa(String nome, Contato contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa: \n" +
                "Nome: " + nome + "\n" +
                "Contato: " + contato;
    }
}
