package academy.devdojo.maratonajava.introducao;

/**
 * Arrays multidimencionais parte 01
 */
public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5,6,7,8,9,10,11,12
        //31,28,31,30
        int[][] dias = new int[3][3];

        System.out.println(dias[0]); // Endereço de memoria do primeiro array do array
        System.out.println(dias[0][0]); // 0

        dias[0][0] = 1; // Valor da primeira posição do primeiro array
        dias[0][1] = 2; // Valor da segunda posição do primeiro array
        dias[0][2] = 3; // Valor da terceira posição do primeiro array

        dias[1][0] = 4; // Valor da primeira posição do segundo array
        dias[1][1] = 5; // Valor da segunda posição do segundo array
        dias[1][2] = 6; // Valor da terceira posição do segundo array

        dias[2][0] = 7; // Valor da primeira posição do terceiro array
        dias[2][1] = 8; // Valor da segunda posição do terceiro array
        dias[2][2] = 9; // Valor da terceira posição do terceiro array

        for (int i = 0; i < dias.length; i++) {
//            System.out.println(dias[i]); // Irá imprimir os endereços de memoria
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        for (int[] arrBase: dias) {
            for (int num: arrBase) {
                System.out.println(num);
            }
        }
    }
}
