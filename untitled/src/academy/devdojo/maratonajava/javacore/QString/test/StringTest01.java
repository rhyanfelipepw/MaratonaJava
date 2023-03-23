package academy.devdojo.maratonajava.javacore.QString.test;

public class StringTest01 {
    public static void main(String[] args) {
        // STRING DECLARADA LITERAL È DIRETAMENTE DO POOL
        String nome = "Will"; // String const pool
        String nome2 = "Will";


        // Não é possivel alterar uma string no pool de strings
        // nome = nome.concat("Suane"); troca a variavel de referencia
        // nome.concat("Suane"); mantém a variavel de referencia.



        System.out.println(nome.equals(nome2)); // COMPARA VALOR
        System.out.println(nome == nome2); // COMPARADA REFERENCIA

        System.out.println(nome);
        System.out.println(nome2);

        // STRING UTILIZANDO CONSTRUTORES SÃO GERADOS OBJETOS STRING QUE FAZEM REFERENCIA A UMA STRING NO POOL
        String nome3 = new String("Will"); // VARIAVEL DE REFERENCIA, OBJETO DO TIPO STRING, STRING NO POOL
        // PEGA A STRING DO POOL E COMPARA AO OBJETO
        System.out.println(nome2 == nome3);
        // PEGA A STRING E COMPARA COM A STRING NO POOL
        System.out.println(nome2 == nome3.intern());
    }
}
