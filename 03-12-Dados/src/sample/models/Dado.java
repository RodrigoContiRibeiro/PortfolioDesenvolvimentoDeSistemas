package sample.models;

import java.util.Random;

public class Dado {
    //Atributo
    private int face;

    //Inicializando no construtor a face com 0
    public Dado() {
        this.face = 0;
    }

    //Consiguir a face
    public int getFace() {
        return face;
    }

    //Atribuir à face um valor randômico entre 1 e 7
    public void lancarDado() {
        Random rnd = new Random();
        this.face = rnd.nextInt(6 - 1 + 1) + 1;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "face=" + face +
                '}';
    }
}