package sample;

import sample.model.Cliente;

public class ClienteMain {
    public static void main(String[] args) {
        //Instanciando a classe Cliente e executando os seus métodos
        //Printando eles para ficar mais visual
        Cliente cliente = new Cliente("Rodrigo", "rodrigo@gmail.com", "123456789", 16);
        cliente.verifyAge();
        System.out.println("=====Pegando os dados=====");
        cliente.getAll();
        System.out.println("=====Pegando os dados===== \n");
        System.out.println("=====Mudando os dados=====");
        cliente.setNome("Rodrigo 2");
        cliente.setEmail("rodrigo2@gmail.com");
        cliente.setTel("012345678");
        cliente.setAge(20);
        cliente.getAll();
        System.out.println("=====Mudando os dados===== \n");
    }
}
