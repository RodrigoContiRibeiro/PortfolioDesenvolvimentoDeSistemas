package sample.models;

public class Endereco {
    //Atributos privados
    private String rua, bairro, cidade;
    private int numero;
    
    //Construtor para inicializar os atributos com dados providos
    public Endereco(String rua, String bairro, String cidade, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }
    //Getters & Setters
    public Endereco() {
        super();
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Sobrescrevendo o método ToString do java para printar os atributos
    @Override
    public String toString() {
        return "Rua: " + rua + "| " +
                "Bairro: " + bairro + "| " +
                "Cidade: " + cidade + "| " +
                "Número: " + numero;
    }
}
