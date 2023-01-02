package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar da superClasse
        // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar da filha
        // 2 - Alocado espaço em memória pro objeto da classe superClasse
        // 3 - Cada Atributo da superClasse é criado e inicializado com os valores default ou os parametros.
        // 4 - Bloco de inciailização da superClasse é executado na ordem que aparece
        // 5 - Construtor da superClassse é executado
        // 6 - Alocado espaço em memória pro objeto da classe subClasse
        // 7 - Cada Atributo da subClasse é criado e inicializado com os valores default ou os parametros.
        // 8 - Bloco de inciailização da subClasse é executado na ordem que aparece
        // 9 - Construtor da subClasse é executado

        Funcionario func = new Funcionario("Rhyan Felipe");

    }
}
