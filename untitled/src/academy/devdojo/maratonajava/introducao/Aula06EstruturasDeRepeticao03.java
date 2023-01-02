package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int count = 1; count <= valorMax; count++) {
            if (count > 25) {
                break;
            }
            System.out.println("Numero " + count);
        }
    }
}
