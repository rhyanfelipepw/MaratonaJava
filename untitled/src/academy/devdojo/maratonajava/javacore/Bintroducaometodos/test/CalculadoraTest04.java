package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num = 1;
        int num2 = 2;

        // Variaveis primitivas quando passados para metodos não entregam o endereço e sim o valor
        calculadora.alteraDoisNumeros(num, num2);

        // Variável e valor não sofreram alterações
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1: " +num);
        System.out.println("Num2: " +num2);

    }
}
