package sample.models;

public abstract class Pessoa {
    //Atributos
    private String nome, cpf;
    private Endereco endereco;
    //COnstrutor sobrecarregado
    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    //Setter de Endereco sobrecarregado para receber atributos dessa classe
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEndereco(String rua, int numero) {
        this.endereco = new Endereco(rua, numero);
    }
    //Sobrescrita de toString
    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCPF: " + cpf +
                endereco;
    }
}
