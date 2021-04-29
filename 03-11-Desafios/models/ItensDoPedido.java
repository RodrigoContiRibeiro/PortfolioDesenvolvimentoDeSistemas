package sample.models;

import java.util.ArrayList;

public class ItensDoPedido {
    //Criando uma lista como atributo para armazenar os produtos 
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    //Contrutor para os atributos
    public ItensDoPedido(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    //Overload do construtor
    public ItensDoPedido() {
        super();
    }
    //Getter
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    //Setter com os atributos de Produto para instanciar ele
    public void setProduto(String nome, double preco) {
        Produto produto = new Produto(nome,preco);
        produtos.add(produto);
    }
    //To String do java sobrescrito
    @Override
    public String toString() {
        return "" + produtos;

    }
}
