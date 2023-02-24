package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public  static void calculaImposto(Produto produto){
        System.out.println("Relatorio de imposto do computador:");
        double imposto = produto.calcularImposto();
        System.out.println("Nome produto: " + produto.getNome());
        System.out.println("Valor: : " + produto.getValor());
        System.out.println("Imposto a ser pago:" + imposto);

        if(produto instanceof Tomate){
            System.out.println(((Tomate) produto).getDataValidade());
        }
    }
}
