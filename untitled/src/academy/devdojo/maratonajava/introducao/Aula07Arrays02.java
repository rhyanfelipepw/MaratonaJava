package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Inicialização de variaveis globais e em arrays
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // Tipos reference null

        String[] nomes = new String[4];
        // Ao reinicializar uma variável o Garbage collector limpa a memoria e faz referencia a um novo objeto
        nomes = new String[4];
        System.out.println("Posição 1: " + nomes[0]);
        System.out.println("Posição 2: " + nomes[1]);
        System.out.println("Posição 3: " + nomes[2]);
        System.out.println("Posição 3: " + nomes[3]);

        nomes[0] = "Luffy";
        nomes[1] = "Ichigo";
        nomes[2] = "kirito";
        nomes[3] = "Ains";

        for (int i = 0; i < nomes.length  ; i++) {
            System.out.println(nomes[i]);
        }

    }
}
