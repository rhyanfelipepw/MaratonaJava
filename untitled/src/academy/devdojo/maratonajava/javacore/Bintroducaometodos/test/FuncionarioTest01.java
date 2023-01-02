package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setNome("Rhyan");
        func.setIdade(21);
        func.setSalarios(new float[]{6000,4000,8000});

        func.imprimirOsDados();
        func.mediaSalarial();
    }
}
