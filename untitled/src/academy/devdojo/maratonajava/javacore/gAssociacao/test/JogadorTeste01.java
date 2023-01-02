package academy.devdojo.maratonajava.javacore.gAssociacao.test;

import academy.devdojo.maratonajava.javacore.gAssociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Rhyan");
        Jogador jogador2 = new Jogador("Felipe");
        Jogador jogador3 = new Jogador("Kaka ");

        Jogador[] jogadores =  {jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores){
            jogador.imprime();
        }

    }
}
