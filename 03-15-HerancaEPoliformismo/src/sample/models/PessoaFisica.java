package sample.models;

public final class PessoaFisica extends Pessoa {
    //Atributos
    private String cpf, rg;
    //Construtores sobrecarregados para receberem diferentes valores
    public PessoaFisica(String nome, Endereco endereco, String cpf, String rg) {
        super(nome, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }

    public PessoaFisica(String nome, String cpf, String rg) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
    }

    public PessoaFisica(String nome) {
        super(nome);
    }
    //Getters & Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    //Sobrecarga do toString
    @Override
    public String toString() {
        return "PessoaFisica:" +
                "\n    Nome: " + super.getNome() +
                (cpf != null ? "\n    CPF: " + cpf : "") +
                (rg != null ? "\n    RG: " + rg : "") + super.toString();


    }
}
