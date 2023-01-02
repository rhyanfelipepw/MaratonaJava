package academy.devdojo.maratonajava.introducao;

import java.util.List;

/**
 * Aula 07 <b>Arrays</b>
 */
public class Aula07Arrays01 {
    public static void main(String[] args) {
        // Somente variavéis do tipo reference aceitam null por ainda não fazer referencia a um objeto em memoria.
        int[] idades = new int[3]; // ARRAYS SÃO CONSIDERADOS OBJETOS

        // São inicializados com um valor padrão
        System.out.println("Posição 1: " + idades[0]); // 0
        System.out.println("Posição 2: " + idades[1]); // 0
        System.out.println("Posição 3: " + idades[2]); // 0

        idades[0] = 10; //
        idades[1] = 15; //
        idades[2] = 20; //

        System.out.println(idades); // Endereço de memoria do array
        System.out.println("Posição 1: " + idades[0]); // 10
        System.out.println("Posição 2: " + idades[1]); // 15
        System.out.println("Posição 3: " + idades[2]); // 20

    }
}
