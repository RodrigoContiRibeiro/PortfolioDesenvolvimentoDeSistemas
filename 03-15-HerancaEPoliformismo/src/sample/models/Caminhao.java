package sample.models;

public class Caminhao extends Veiculo {
    //Atributos
    private int eixos;
    //Construtor
    public Caminhao(String nome, int eixos) {
        super(nome);
        this.eixos = eixos;
    }
    //Getters & Setters
    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    //ToString sobrescrito
    @Override
    public String toString() {
        return "Caminhao:\n" + super.toString() + "\n" +
                "Eixos: " + eixos + "\n";
    }
}
