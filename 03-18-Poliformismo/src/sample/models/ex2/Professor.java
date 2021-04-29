package sample.models.ex2;

public class Professor extends Pessoa {
    //Atributos
    private double horasTrabalhadas, valorHora, salario;
    //COnstrutores sobrecarregados
    public Professor(String nome, double horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public Professor(double horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    //Getters & Setters
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void calcularSalario() {
        this.salario = this.horasTrabalhadas * this.valorHora;
    }
    //SObrescrita do método toString
    @Override
    public String toString() {
        return super.toString() +
                "\nProfessor: " +
                "\n   Horas Trabalhadas: " + horasTrabalhadas +
                "\n   Valor da Hora " + valorHora +
                "\n   Salário: R$" + salario;
    }
}
