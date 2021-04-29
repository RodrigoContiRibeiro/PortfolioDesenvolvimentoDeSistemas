package sample;

import sample.model.Veiculo;

public class VeiculoMain {
    public static void main(String[] args) {
    	//Instanciando a classe Veiculo e executando os seus métodos
        Veiculo veiculo = new Veiculo("ABCD1234");
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Velocidade: " + veiculo.getVelocidade());
        veiculo.acelerar(50);
        veiculo.acelerar(10);
        veiculo.frear(50, 10);
        veiculo.acelerar(10);
        veiculo.frear(15, 5);

    }
}
