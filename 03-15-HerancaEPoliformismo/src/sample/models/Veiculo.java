package sample.models;

public abstract class Veiculo {
    //Atributos com a classe Marca como atributo
    private String nome;
    private Marca marca;
    //Construtor
    public Veiculo(String nome) {
        this.nome = nome;
    }
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setMarca(String nome, String descricao) {
        this.marca = new Marca(nome, descricao);
    }
    //SObrescrita do método toString
    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nMarca: " + getMarca();
    }
}
