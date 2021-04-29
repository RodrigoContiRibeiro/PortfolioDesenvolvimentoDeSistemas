package sample.models;

import java.util.ArrayList;

public class Pedido {
    private String descricao;
    private String data;
    private double total;
    private ItensDoPedido itensDoPedido;

    public Pedido(String descricao, String data, double total) {
        this.descricao = descricao;
        this.data = data;
        this.total = total;
    }

    public double faturarPedido() {
        ArrayList<Produto> produtos = itensDoPedido.getProdutos();
        if (produtos != null) {
            for (int i = 0; i < produtos.size(); i++) {
                total += produtos.get(i).getPreco();
            }
        } else {

        }
        return total;
    }
    public void addProduto(String nome, double preco){
        itensDoPedido.setProduto(nome,preco);
    }
    public void addProduto(){
        itensDoPedido.setProduto();
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public ItensDoPedido getItensDoPedido() {
        return itensDoPedido;
    }

    public void setItensDoPedido(ItensDoPedido itensDoPedido) {
        this.itensDoPedido = itensDoPedido;
    }

    @Override
    public String toString() {
        return "Pedido: " +
                "\n Descricao: " + descricao +
                "\n Data: " + data +
                "\n Total: R$" + total +
                "\n Itens Do Pedido: " + itensDoPedido;
    }
}
