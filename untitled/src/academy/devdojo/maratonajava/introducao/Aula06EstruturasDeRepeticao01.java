package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        // VERIFICA E EXECUTA A CONDIÇÃO
        while (count < 10) {
            System.out.println("while " + count++);
        }

        // EXECUTA E VERIFICA A CONDIÇÃO
        do {
            System.out.println("do while " + count++);
        } while (count < 10);

        // Necessário inicializar o valor para ser considerado um statement
        for (count = 0; count > 10; count++) {
            System.out.println("for " + count);
        }

    }
}
