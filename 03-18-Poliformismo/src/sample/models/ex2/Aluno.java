package sample.models.ex2;

public class Aluno extends Pessoa {
    //Atribuots
    private String nota1, nota2;
    private double media;
    //Construtor sobrecarregado
    public Aluno(String nome, String nota1, String nota2) {
        super(nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno(String nota1, String nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno() {
    }
    //Getter & Setter
    public String getNota1() {
        return nota1;
    }

    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }
    //Método para calcular a média usando os atributos
    public void calcularMedia() {
        double nota1 = Double.parseDouble(getNota1());
        double nota2 = Double.parseDouble(getNota2());
        this.media = (nota1 + nota2) / 2;
    };
    //Sobrescrita do método toString
    @Override
    public String toString() {
        return super.toString() +
                "\nAluno: " +
                "\n   Notas: " + nota1 + " + " + nota2 +
                "\n   Média: " + media;
    }
}
