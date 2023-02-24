package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        // classe abstrata não contém instância, é apenas um template.
        // Funcionario funcionario = new Funcionario("Zoro", 2000);


        Gerente gerente = new Gerente("Nami", 2000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Rhyan", 5000);

        // System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(desenvolvedor);



    }
}
