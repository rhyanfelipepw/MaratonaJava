package academy.devdojo.maratonajava.javacore.Aintroucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroucaoclasses.domain.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Rhyan";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println("/////////////");
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println("/////////////");
    }
}
