package academy.devdojo.maratonajava.javacore.gAssociacao.test;

import academy.devdojo.maratonajava.javacore.gAssociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.gAssociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Rhyan");
        Time time = new Time("Brasil");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
