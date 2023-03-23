package academy.devdojo.maratonajava.javacore.QString.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Rhyan";
        String numeros = "01234";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("R", "L"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println("////////////////////");
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3));
        System.out.println(numeros.substring(3, numeros.length()));
        System.out.println(nome.trim()); // RETIRA OS ESPAÇOS EM BRANCO NO COMEÇO E FIM
    }
}
