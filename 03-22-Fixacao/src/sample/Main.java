package sample;

import sample.models.*;

public class Main {
    public static void main(String[] args) {
        //Instanciando Cliente com seus atributos no cosntrutor
        Cliente c1 = new Cliente("Rodrigo","123.321.123-32","rodrigo@gmail.com");
        //Setando o atributo Endereco da instância de Cliente
        c1.setEndereco("Rua sei lá",888);
        //Criando um objeto de ItensDoPedido
        ItensDoPedido pedido = new ItensDoPedido();
        //Passando Produtos para o atributo/lista de ItensDoPedido
        pedido.setProdutos("Arroz",10);
        Produto produto1 = new Produto("Feijão", 10);
        pedido.setProdutos(produto1);
        pedido.setProdutos("Refrigerante",25);
        //Chamando o método para calcular o atributo total do objeto de ItensDoPedido
        pedido.calcularTotal();
        //Instanciando Pedido com o ItensDoPedido
        Pedido pedido1 = new Pedido("01/01/2020", pedido);
        //Setando o Cliente
        pedido1.setCliente(c1);
        //Printando
        System.out.println(pedido1);

    }
}
