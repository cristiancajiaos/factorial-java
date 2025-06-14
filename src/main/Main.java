package main;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.setValor(5);
        
        int valor = factorial.getValor();
        System.out.println(factorial.iniciarFactorial());
    }
}
