package sample.models;

public class Jogador {
    //Atributos
    private final String nome;
    private final int[] jogadas = new int[2];//Armazenando as jogadas em um array
    private boolean venceu;

    //O construtor lança os dados ao criar o jogador e armazena os valores no array
    public Jogador(String nome, Dado dado1, Dado dado2) {
        this.nome = nome;
        dado1.lancarDado(); //COlocar no cotroller
        dado2.lancarDado();
        this.jogadas[0] = dado1.getFace();
        this.jogadas[1] = dado2.getFace();
    }

    //Pegar o nome do jogador
    public String getNome() {
        return nome;
    }

    //Retorna uma String com as jogadas
    public String getJogadas() {
        StringBuilder jogada = new StringBuilder();
        jogada.append("| ");
        for (int i = 0; i < jogadas.length; i++) {
            jogada.append(jogadas[i]);
            if (i == 0) jogada.append(" , ");
        }
        jogada.append(" | ");
        return jogada.toString();
    }

    //Pega o boolean
    public boolean isVenceu() {
        return venceu;
    }

    //Muda o boolean
    public void setVenceu(boolean venceu) {
        this.venceu = venceu;
    }

    //Retorna a soma das faces no array
    public int sum() {
        int soma = 0;
        for (int jogada : jogadas) {
            soma += jogada;
        }
        return soma;
    }

    //Retorna uma String fazendo a verificação
    public String verificar() {
        System.out.print(getJogadas());
        if (sum() == 7) setVenceu(true);
        return isVenceu() ? "- " + getNome() + " Venceu" : "- " + getNome() + " Perdeu (" + sum() + ").";
    }
}