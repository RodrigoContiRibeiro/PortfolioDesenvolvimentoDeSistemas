package sample.models;

public final class Cliente extends Pessoa {
    //Atributos
    private String email;
    //Construtor sobrecarregado
    public Cliente(String nome, String cpf, String email, Endereco endereco) {
        super(nome, cpf, endereco);
        this.email = email;
    }

    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf);
        this.email = email;
    }
    //Getter & Setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //Sobrescita do toString
    @Override
    public String toString() {
        return "\nEmail: " + email +
                super.toString();

    }
}
