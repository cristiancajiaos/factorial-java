package main;

public class Factorial {
    private int valor;
    private int resultado;

    public Factorial() {
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int factorial(int numero) {
        int producto;
        producto = (numero > 1) ? numero * this.factorial(numero-1) : 1;
        this.setResultado(producto);
        return producto;
    }
    
    
    
}
