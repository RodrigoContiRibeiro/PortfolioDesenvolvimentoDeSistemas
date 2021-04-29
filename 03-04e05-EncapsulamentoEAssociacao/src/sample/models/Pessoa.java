package sample.models;

public class Pessoa {
    //Atributos privados
    private String nome, nasc;
    //Pessoa possui uma instancia da classe Endereco, pois estão associadas
    private Endereco endereco;

    //Construtor para inicializar os atributos com dados providos
    public Pessoa(String nome, String nasc) {
        this.nome = nome;
        this.nasc = nasc;
    }
    //Sobrecarga do construtor de Pessoa para deixar opcional o uso dele
    public Pessoa() {
        super();
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //Sobrecarregando o setter da instancia de Endereco para imitar o comportamento de um construtor
    public void setEndereco(String rua, String bairro, String cidade, int numero){
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setNumero(numero);

        setEndereco(endereco);
    }
    
    //Sobrescrevendo o método ToString do java para printar os atributos
    public String toString() {
        return "\nPessoa: \n" +
                "Nome: " + nome + "\n" +
                "Data de Nascimento: " + nasc + "\n" +
                "Endereço: " + endereco + "\n";
    }
}
