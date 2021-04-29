package sample.models.ex1;

public abstract class Pessoa {
    //Atributos
    private String nome, sobrenome, email, telefone;
    //COnstrutor sobrecarregado
    public Pessoa(String nome, String sobrenome, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }

    public Pessoa() {
    }
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //Método toString sobrescrito
    @Override
    public String toString() {
        return "Pessoa: " +
                (nome != null ? "\nNome: " + nome : "") +
                (sobrenome != null ? "\nSobrenome: " + sobrenome : "") +
                (email != null ? "\nEmail: " + email : "") +
                (telefone != null ? "\nTelefone: " + telefone : "");
    }
}
