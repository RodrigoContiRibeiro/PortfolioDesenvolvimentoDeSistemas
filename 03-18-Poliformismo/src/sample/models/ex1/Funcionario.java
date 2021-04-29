package sample.models.ex1;

public final class Funcionario extends Pessoa {
    //Atributos
    private String funcao;
    private double salario;
    //Atributos
    public Funcionario(String nome, String sobrenome, String email, String telefone, String funcao) {
        super(nome, sobrenome, email, telefone);
        this.funcao = funcao;
    }

    public Funcionario(String funcao) {
        this.funcao = funcao;
    }
    //Getters & Setters
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }
    //Setter com calculo do salario
    public void setSalario(double valorHora, double horasTrabalhadas) {
        this.salario = valorHora * horasTrabalhadas;
    }
    //Sobrescrita do método toString
    @Override
    public String toString() {
        return super.toString() + "\n   Funcionário: " +
                "\n   Funcão: " + funcao +
                "\n   Salário: R$" + salario;
    }
}
