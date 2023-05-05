package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d TODOS OS DIGITOS
        // \D TUDO QUE NAO FOR DIGITO
        // \s TODOS OS ESPACOS EM BRANCO \t \n \f \r
        // \S TODOS OS CARACTERES EXCLUINDO OS BRANCOS
        // \w TODOS QUE FOR DE a-z A-Z , DIGITOS, _
        // \W TODOS QUE nAO FORAM a-z A-Z, DIGITOS, _

        String regex = "\\d";
        String text = "Oj120938401924SADPO";
        Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(text);
        System.out.println("Texto:  " + text);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.println("INDICE " + matcher.start() + " CONTEM " + matcher.group() + " ");
        }
    }
}
