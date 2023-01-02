package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 até 100000
        for (int count = 1; count <= 1000000; count++) {
            if (count % 2 == 0) {
                System.out.println("Numero " + count);
            }
        }


    }
}
