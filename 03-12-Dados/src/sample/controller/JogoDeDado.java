package sample.controller;

import sample.models.Dado;
import sample.models.Jogador;

import java.util.ArrayList;

public class JogoDeDado {
    //Dados como Atributos
    Dado dado1;
    Dado dado2;
    ArrayList<Jogador> jogadores = new ArrayList<>();

    //Inicializando os dois dados
    public JogoDeDado() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
    }

    //Adiciona um novo jogador ao ArrayList passando os nomes e os dados
    public void addJogador(String nome) {
        Jogador jogador = new Jogador(nome, dado1, dado2);
        jogadores.add(jogador);
    }

    //Cria os jogadores baseado nas strings passadas no mais
    //Chama o printJogadas
    public void jogar(ArrayList<String> jogadores) {
        for (String jogador : jogadores) {
            addJogador(jogador);
        }
        printJogadas(this.jogadores);
    }

    //Printa as strings retornadas do verificar
    public void printJogadas(ArrayList<Jogador> jogadores) {
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.verificar());
        }
    }
}