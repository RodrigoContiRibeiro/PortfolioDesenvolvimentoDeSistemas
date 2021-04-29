package sample;

import sample.model.Produto;

import java.util.ArrayList;

public class ProdutoMain {
    public static void main(String[] args) {
        //Instanciando a classe Produto e executando os seus métodos
        //Criando um ArrayList para armazenar as instâncias de Produto
        ArrayList<Produto> produtos = new ArrayList<>();
        
        Produto produto1 = new Produto("Arroz", 10);

        Produto produto2 = new Produto("Feijão", 15);

        Produto produto3 = new Produto("Bife", 40);

        Produto produto4 = new Produto("Batata", 25);

        //Colocando as instâncias no ArrayList
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

	//Printando o ArrayList de Produtos
        System.out.println(produtos);
    }
}
