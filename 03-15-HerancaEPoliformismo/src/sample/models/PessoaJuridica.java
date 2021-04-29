package sample.models;

public final class PessoaJuridica extends Pessoa {
    //Atributos
    private String cnpj, ie;
    //Construtores sobrecarregados para receberem diferentes valores
    public PessoaJuridica(String nome, Endereco endereco, String cnpj, String ie) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public PessoaJuridica(String nome, String cnpj, String ie) {
        super(nome);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public PessoaJuridica(String nome) {
        super(nome);
    }
    //Getters & Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    //Sobrecarga do toString
    @Override
    public String toString() {
        return "PessoaJuridica: " +
                "\n    Nome: " + super.getNome() +
                (cnpj != null ? "\n    CNPJ: " + cnpj : "") +
                (ie != null ? "\n    IE: " + ie : "") + super.toString();
    }
}
