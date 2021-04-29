package sample;

import sample.models.ex2.Aluno;
import sample.models.ex2.Professor;

public class AlunoProfPessoaMain {
    public static void main(String[] args) {
        //Instanciando Aluno, chamando o método para calcular a média e printando
        Aluno rodrigo = new Aluno("Rodrigo", "7", "10");
        rodrigo.calcularMedia();
        System.out.println(rodrigo.toString());
        //Instanciando Professor, chamando o método para calcular o salário e printando
        Professor paulo = new Professor("Paulo", 150,25);
        paulo.calcularSalario();
        System.out.println(paulo.toString());
    }
}
