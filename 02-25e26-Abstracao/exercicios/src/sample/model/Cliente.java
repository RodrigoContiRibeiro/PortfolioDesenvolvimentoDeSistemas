package sample.model;

public class Cliente {
    //Atributos
    String nome;
    String email;
    String tel;
    int age;

    //Construtor para inicializar os atributos com valores providos
    public Cliente(String nome, String email, String tel, int age) {
        this.nome = nome;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    //Método para verificar se a idade é um número natural
    public void verifyAge() {
        if (this.age < 0) {
            System.out.println("400 bad request");
        }
    }

    //Getters & Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    //Método para printar todos os atributos diretamente.
    public void getAll() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTel());
        System.out.println("Idade: " + getAge());
    }
}
