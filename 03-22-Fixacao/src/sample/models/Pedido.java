package sample.models;

public class Pedido {
    //Atributos com as classes associadas
    private String data;
    private ItensDoPedido itens;
    private Cliente cliente;
    //COnstrutor sobrecarregado
    public Pedido(String data, ItensDoPedido itens, Cliente cliente) {
        this.data = data;
        this.itens = itens;
        this.cliente = cliente;
    }

    public Pedido(String data, ItensDoPedido itens) {
        this.data = data;
        this.itens = itens;
    }
    //Getters & Setters
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ItensDoPedido getItens() {
        return itens;
    }

    public void setItens(ItensDoPedido itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    //Sobrecarga do toString
    @Override
    public String toString() {
        return "Pedido: " +
                "\nData: " + data +
                itens +
                cliente;
    }
}
