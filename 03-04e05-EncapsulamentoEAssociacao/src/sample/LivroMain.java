package sample;

import sample.models.Livro;

import java.util.ArrayList;

public class LivroMain {
    public static void main(String[] args) {
        //Criando uma lista para armazenar as instâncias de Livro
        ArrayList<Livro> livros = new ArrayList<>();

        //Instanciando a classe Livro
        Livro livro1 = new Livro();
        livro1.setTitulo("A Morte de Ivan Ilitch");
        livro1.setAutor("Liev");
        livro1.setEditora("Companhia das Letras");
        livro1.setAno(1888);
        Livro livro2 = new Livro();
        livro2.setTitulo("Anna Karênina");
        livro2.setAutor("Liev");
        livro2.setEditora("Companhia das Letras");
        livro2.setAno(1878);
        Livro livro3 = new Livro("Guerra e paz","Liev","Companhia das Letras",1868);

        //Adicionando os objetos de Livro na lista
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

	//Printando a lista com todos os objetos
        System.out.println(livros);
    }
}
