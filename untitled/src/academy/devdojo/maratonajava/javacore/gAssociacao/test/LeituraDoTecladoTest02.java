package academy.devdojo.maratonajava.javacore.gAssociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande sábio irá responder a qualquer pergunta");
        System.out.println("Faça a sua pergunta meu caro jovem");
        String pergunta =  input.nextLine();
        if (pergunta.charAt(0) ==  ' '){
            System.out.println("Sem sombra de dúvidas!");
        }else{
            System.out.println("NÃO!");
        }
    }
}
