package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // Inicializações de array's
        int[] numeros = new int[5];
        int[] numeros3 = {1,2,3,4,5};
        int[] numeros4 = new int []{1,2,3,4,5};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println("Numeros3: " + numeros3[i]);
        }

        for (int i = 0; i < numeros4.length; i++) {
            System.out.println("Numeros4: " + numeros4[i]);
        }

        for (int num: numeros3) {
            System.out.println("forEach numeros3: " + num);
        }

        for (int num: numeros4){
            System.out.println("forEach numeros4 " + num);
        }
    }
}

