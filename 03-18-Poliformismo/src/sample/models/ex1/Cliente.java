package sample.models.ex1;

public final class Cliente extends Pessoa {
    //Atributos
    private String dataCadastro;
    //Construtor sobrecarregado 
    public Cliente(String nome, String sobrenome, String email, String telefone, String dataCadastro) {
        super(nome, sobrenome, email, telefone);
        this.dataCadastro = dataCadastro;
    }

    public Cliente(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    //Método toString sobrescrito
    @Override
    public String toString() {
        return super.toString() + "\n   Cliente: " +
                "\n   Data de Cadastro: " + dataCadastro + "\n";
    }
}
