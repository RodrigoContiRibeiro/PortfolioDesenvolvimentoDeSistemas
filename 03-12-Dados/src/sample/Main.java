package sample;

import sample.controller.JogoDeDado;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Array para os jogadores
        ArrayList<String> jogadores = new ArrayList<>();
        //Adicionando jogadores ao array
        jogadores.add("Rodrigo");
        jogadores.add("Claudio");
        jogadores.add("Paulo");
        jogadores.add("João");
        jogadores.add("Maria");
        //Criando o jogo 
        JogoDeDado jogo = new JogoDeDado();
        //Chamando o método jogar passando os jogadores
        jogo.jogar(jogadores);
    }
}
