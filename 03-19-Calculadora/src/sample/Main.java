package sample;

public class Main {
    public static void main(String[] args) {
        //Instanciando Calculadora
        Calculadora calc = new Calculadora();
        //Chamando o método para calcular
        calc.somar(10,40,10);
        //Printando
        System.out.println(calc.toString());
    }
}
