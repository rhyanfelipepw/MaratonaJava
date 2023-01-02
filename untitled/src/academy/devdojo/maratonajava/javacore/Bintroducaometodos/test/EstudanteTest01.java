package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Midorya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Bakugou";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        // Variaveis de referencia passam a referencia para o metodo e não o valor
        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);

        System.out.println("##################");
        
        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);


    }
}
