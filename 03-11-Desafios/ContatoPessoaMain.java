package sample;

import sample.models.Contato;
import sample.models.Pessoa;

public class ContatoPessoaMain {
    public static void main(String[] args) {
        Contato contato = new Contato("123456789", "exemplo@gmail.com", "@exemplo");
        Pessoa pessoa = new Pessoa("Exemplo", contato);
        System.out.println(pessoa.toString());

    }
}
