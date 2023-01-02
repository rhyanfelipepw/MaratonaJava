package academy.devdojo.maratonajava.javacore.gAssociacao.test;

import academy.devdojo.maratonajava.javacore.gAssociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.gAssociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.gAssociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.gAssociacao.dominio.Seminario;

public class SeminariosTest01 {
    public static void main(String[] args) {
        Local local = new Local("São paulo");
        Aluno aluno = new Aluno("Rhyan", 21);
        Professor professor = new Professor("Luffy", "Pirata");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("Animes", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
