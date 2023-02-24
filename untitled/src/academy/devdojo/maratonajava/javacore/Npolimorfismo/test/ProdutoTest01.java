package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {



    public static void main(String[] args) {
        Computador computador = new Computador("Intel5", 10000);
        Tomate tomate = new Tomate("Vermelho Tomate", 5);
        Televisao televisao = new Televisao("LG 50\"", 5000.0);

        CalculadoraImposto.calculaImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto.calculaImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calculaImposto(televisao);
    }
}
