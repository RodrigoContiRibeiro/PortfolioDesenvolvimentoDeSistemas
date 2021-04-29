package sample;

import sample.models.Endereco;
import sample.models.Pessoa;

import java.util.ArrayList;

public class PessoaEnderecoMain {
    public static void main(String[] args) {
        //Criando uma lista para armazenar as instâncias de Pessoa
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        //Instanciando a classe Endereço
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Nevsky Ave");
        endereco1.setBairro("Tsentralny");
        endereco1.setCidade("São Petesburgo");
        endereco1.setNumero(1111);

        Endereco endereco3 = new Endereco(
                "Bolshoy Prospekt",
                "Petrogradsky",
                "São Petesburgo",
                3333);

        //Fazendo uma associação entre Pessoa e Endereco ao instanciar a classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Rodrigo");
        pessoa1.setNasc("04/04/2000");
        pessoa1.setEndereco(endereco1);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Claudio");
        pessoa2.setNasc("04/04/2000");
        pessoa2.setEndereco(
                "Zagorodnyy Prospekt",
                "Vladimirsky",
                "São Petesburgo",
                2222);

        Pessoa pessoa3 = new Pessoa("Liev", "09/09/1828");
        pessoa3.setEndereco(endereco3);

        Pessoa pessoa4 = new Pessoa();

	//Adicionando as instâncias de pessoa na lista
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

	//Printando todas as pessoas
        System.out.println(pessoas);
    }
}
