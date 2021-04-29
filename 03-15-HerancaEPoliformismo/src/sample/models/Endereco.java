package sample.models;

public class Endereco {
    //Atributos
    private String rua, bairro, cep;
    private int numero;
    //Construtor com os atributos
    public Endereco(String rua, String bairro, String cep, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.numero = numero;
    }
    //Getters & Setters
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    //Sobrecarga do método toString
    @Override
    public String toString() {
        return "\n         Rua: " + rua + " "+
                "\n         Bairro: " + bairro + " " +
                "\n         CEP: " + cep + " " +
                "\n         Número: " + numero + " ";
    }
}
