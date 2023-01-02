package academy.devdojo.maratonajava.javacore.gAssociacao.test;

import academy.devdojo.maratonajava.javacore.gAssociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.gAssociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Rhyan");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};


        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador1 ---");
        jogador1.imprime();

        System.out.println("--- Jogador2 ---");

        jogador2.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
