package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000

        float vlTotal = 30000;
        for (int parcela = 1; parcela <= vlTotal; parcela++) {
            double valorParcela = vlTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
