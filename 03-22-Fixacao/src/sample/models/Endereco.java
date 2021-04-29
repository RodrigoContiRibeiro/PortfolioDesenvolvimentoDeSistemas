package sample.models;

public class Endereco {
    //Atributos
    private String rua;
    private int numero;
    //Construtor Sobrecarregado
    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco() {
        super();
    }
    //Getters & Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    //SObrescrita do método toString
    @Override
    public String toString() {
        return "\nEndereço: " + rua + ", Nº" + numero;
    }
}
