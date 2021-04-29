package sample.model;

public class Veiculo {
    //Atributos
    int velocidade;
    String placa;


    //Construtor para inicializar a velocidade como 0 e a placa com um valor fornecido
    public Veiculo(String placa) {
        this.placa = placa;
        this.velocidade = 0;
    }

    //Getters
    public int getVelocidade() {
        return this.velocidade;
    }

    public String getPlaca() {
        return this.placa;
    }


    //Método para aumentar a velocidade gradualmente com um valor provido, printando eles
    public void acelerar(int valor) {
        System.out.println("\n Acelerando....");
        for (int i = 0; i < valor; i++) {
            System.out.println(getVelocidade());
            this.velocidade++;
        }
        System.out.println(getVelocidade());
        System.out.println("Fim da aceleração.... \n");
    }

    //Método para diminuir a velocidade gradualmente com um valor provido, printando eles
    //Verificando se a velocidade não vai ficar negativa e interromper
    public void frear(int valor, int valorFreio) {
        if (this.velocidade > 0) {
            System.out.println("\n Freando....");
            for (int i = 0; i < valor/valorFreio; i++) {
                System.out.println(getVelocidade());
                this.velocidade -= valorFreio;
                if (this.velocidade < 1) {
                    i = valor;
                    this.velocidade = 0;
                }
            }

            System.out.println(getVelocidade());
            System.out.println("Fim do freamento.... \n");
        } else {
            System.out.println("Não foi possível freiar.");
        }
    }
}
