package sample;

import sample.models.ItensDoPedido;
import sample.models.Pedido;
import sample.models.Produto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PedidoProdutoMain {
    public static void main(String[] args) {
        //Criando data e formatando ela
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        //Criando um novo Pedido com o construtor deles
        Pedido pedido = new Pedido("Supermercado", dtf.format(now), 0);
        //Chamando o método que adiciona produtos ao pedido
        pedido.addProduto("Alface", 25);
        pedido.addProduto("Carne", 25);
        pedido.addProduto("Arroz", 25);
        pedido.addProduto();
        //CHamando o método para calcular a fatura
        pedido.faturarPedido();
        System.out.println(pedido);
    }
}
