package sample;

import sample.models.Ingrediente;
import sample.models.Receita;

import java.util.ArrayList;

public class ReceiteIngredienteMain {
    public static void main(String[] args) {
        //Instanciando a classe Ingrediente
        Ingrediente i1 = new Ingrediente("Pasta", "Pacote(s)", 0.5);
        Ingrediente i2 = new Ingrediente("Carne Moída", "g", 300);
        Ingrediente i3 = new Ingrediente("Linguiça Calabresa", "Linguiça(s)", 2);
        Ingrediente i4 = new Ingrediente("Molho de Tomate", "Pacote(s)", 2);

        //Criando um ArrayList da classe Ingrediente e adicionando os objetos a essa lista
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(i1);
        ingredientes.add(i2);
        ingredientes.add(i3);
        ingredientes.add(i4);

        //Fazendo a associação entre a lista de Ingrediente's e a class Receita
        //E portanto criando um objeto a partir da classe Receita
        Receita receita = new Receita(
                "Macarrão do Rodrigo.",
                "Macarrão à bolonhesa com linguiça.",
                ingredientes);

        //Printando a instância
        System.out.println(receita);
    }
}
