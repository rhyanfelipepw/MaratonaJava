package academy.devdojo.maratonajava.javacore.gAssociacao.test;

import academy.devdojo.maratonajava.javacore.gAssociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.gAssociacao.dominio.Professor;


public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Robson");
        Professor professor2 = new Professor("Roberta");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Escola municipal João Candido", professores);
        escola.imprime();


    }
}
