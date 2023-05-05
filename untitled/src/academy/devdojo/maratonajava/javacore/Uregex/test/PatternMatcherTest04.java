package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d TODOS OS DIGITOS
        // \D TUDO QUE NAO FOR DIGITO
        // \s TODOS OS ESPACOS EM BRANCO \t \n \f \r
        // \S TODOS OS CARACTERES EXCLUINDO OS BRANCOS
        // \w TODOS QUE FOR DE a-z A-Z , DIGITOS, _ 
        // \W TODOS QUE nAO FORAM a-z A-Z, DIGITOS, _
        // []


        // QUANTIFICADORES
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        //{n,m} de n até m
        // ()
        // | o(v | c)o // FOUND OVO OR OCO
        // $
        // . CORINGA 1.3 = 123, 133, 1@3, 1A3
        // String regex  = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, @#!zoro@gmail.com.br, teste@hotmail.com, sakura@mail";
        System.out.println("text@hotmail.com".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789"); 
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.println("INDICE " + matcher.start() + " CONTEM " + matcher.group() + " ");
        }
        int numeroHex = 0x109;
        System.out.println(numeroHex);
    }
}
