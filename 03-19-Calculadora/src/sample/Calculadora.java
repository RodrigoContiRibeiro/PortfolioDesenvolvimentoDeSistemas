package sample;

public class Calculadora {
    //Atributos
    double a, b, c, resultado;

    //Getters & Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    //Métodos sobrecarregados para fazer os cálculos básicos com 2 ou 3 números
    public void somar(double a, double b) {
        setA(a);
        setB(b);
        this.resultado = a + b;
    }

    public void somar(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
        this.resultado = a + b + c;
    }

    public void subtrair(double a, double b) {
        setA(a);
        setB(b);
        this.resultado = a - b;
    }

    public void subtrair(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
        this.resultado = a - b - c;
    }

    public void multiplicar(double a, double b) {
        setA(a);
        setB(b);
        this.resultado = a * b;
    }

    public void multiplicar(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
        this.resultado = a * b * c;
    }

    public void dividir(double a, double b) {
        setA(a);
        setB(b);
        this.resultado = a / b;
    }

    public void dividir(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
        this.resultado = a / b / c;
    }

    //ToString sobrescrito
    @Override
    public String toString() {
        return "a: " + a +
                "\nb: " + b +
                (c != 0 ? "\nc: " + c : "") +
                "\nResultado: " + resultado;
    }
}
