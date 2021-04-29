package sample;

import sample.models.Caminhao;
import sample.models.Carro;
import sample.models.Marca;

public class MainVeiculo {
    public static void main(String[] args) {
        //Instanciando classe Carro usando o construtor
        Carro c1 = new Carro("Corolla", 4);
        //Setando Marca com os valores de seu cosntrutor
        c1.setMarca("Toyota","Marca legal");
        //Printando
        System.out.println(c1.toString());
        //Criando objeto de Caminhao e uma nova Marca com os seus respectivos atributos
        Caminhao t1 = new Caminhao("Cascadia Evolution", 2);
        Marca marca = new Marca("Freightliner","Marca Boa");
        t1.setMarca(marca);
        //Pristando
        System.out.println(t1.toString());
    }
}
