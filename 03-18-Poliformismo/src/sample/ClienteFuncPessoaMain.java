package sample;

import sample.models.ex1.Cliente;
import sample.models.ex1.Funcionario;

public class ClienteFuncPessoaMain {
    public static void main(String[] args) {
        //Instanciando Funcionario, setando atributos e printando
        Funcionario f1 = new Funcionario("Zelador");
        f1.setSalario(50, 200);
        System.out.println(f1.toString());
        //Instanciando Funcionario, setando atributos e printando
        Funcionario f2 = new Funcionario(
                "Rodrigo",
                "Conti Ribeiro",
                "rodrigo@gmail.com",
                "987654321",
                "CEO");
        f2.setSalario(1000, 300);
        System.out.println(f2.toString());
        //Instanciando Cliente e printando
        Cliente c1 = new Cliente("08/08/2004");
        System.out.println(c1.toString());
        //Instanciando Cliente e printando
        Cliente c2 = new Cliente("Claudio",
                "Conti Ribeiro",
                "claudio@gmail.com",
                "123456789",
                "08/08/2004");
        System.out.println(c2.toString());


    }
}
