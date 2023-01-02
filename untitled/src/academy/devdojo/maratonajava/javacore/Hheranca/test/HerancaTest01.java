package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua romário vidal");
        endereco.setCep("012345209");
        Pessoa pessoa = new Pessoa("Marcos");

        pessoa.setEndereco(endereco);
        pessoa.setCpf("1111111111111");

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Marcos");
        funcionario.setNome("Rhyan");
        funcionario.setCpf("555555555");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200000.0);

        System.out.println("-------------------");
        funcionario.imprime();
    }
}
