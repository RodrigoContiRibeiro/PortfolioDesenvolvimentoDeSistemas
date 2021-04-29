package sample;

import sample.models.Endereco;
import sample.models.PessoaFisica;
import sample.models.PessoaJuridica;

public class MainPessoa {
    public static void main(String[] args) {
        //Criando Endereco para as classes filhas de Pessoa
        Endereco e1 = new Endereco("Rua Legal", "Bairro Show", "123456", 1);
        //Criando PessoaFisica        
        PessoaFisica pf = new PessoaFisica("Rodrigo", e1, "123.321.132-12", "1.234.568");
        //Printando
        System.out.println(pf.toString());
        //Criando PessoaJuridica
        PessoaJuridica pj = new PessoaJuridica("Rodrigo", e1, "123.321.132-12", "1.234.568");
        //Printando
        System.out.println(pj.toString());
        //Criando outros objetos mas usando o setter de Endereco com os valores dos atributos do mesmo
        PessoaFisica pf2 = new PessoaFisica("Rodrigo", "123.321.132-12", "1.234.568");
        pf2.setEndereco("Rua Show", "Bairro Massa", "123456", 999);
        System.out.println(pf2.toString());
        PessoaJuridica pj2 = new PessoaJuridica("Rodrigo", "123.321.132-12","1.234.568");
        pj2.setEndereco("Rua Massa","Bairro Legal","123456",777);
        System.out.println(pj2.toString());
    }
}
