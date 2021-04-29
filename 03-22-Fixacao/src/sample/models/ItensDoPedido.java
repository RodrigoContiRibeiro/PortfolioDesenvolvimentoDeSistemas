package sample.models;

import java.util.ArrayList;

public class ItensDoPedido {
    //Atributos, um deles sendo uma lista da classe Produto
    private ArrayList<Produto> produtos;
    private double total = 0;

    //Inicializar a lista no construtor para evitar erros
    public ItensDoPedido(){
        this.produtos = new ArrayList<>();
    }
    //Getters & Setters
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    //Setter de Produtos sobrecarregado para receber de diferentes forma um objeto de Produto
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setProdutos(Produto produto) {
        produtos.add(produto);
    }

    public void setProdutos(String nome, double preco) {
        Produto newProduto = new Produto(nome, preco);
        produtos.add(newProduto);
    }

    public double getTotal() {
        return total;
    }
    //Método para iterar a lista e calcular o total com um dos atributos de Produto
    public void calcularTotal() {
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
    }
    //Sobrescrita do toString
    @Override
    public String toString() {
        return
                "\nTotal: R$" + total +
                "\nProdutos: " + produtos;
    }
}
