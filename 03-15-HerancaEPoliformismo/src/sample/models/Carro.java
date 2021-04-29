package sample.models;

public class Carro extends Veiculo{
    //Atributos
    private int portas;
    //Construtor para o atributo super e this
    public Carro(String nome, int portas) {
        super(nome);
        this.portas = portas;
    }
    //Getters & Setters
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    //To string
    @Override
    public String toString() {
        return "Carro:\n" + super.toString() + "\n" +
                "Portas: " + portas + "\n";
    }
}
