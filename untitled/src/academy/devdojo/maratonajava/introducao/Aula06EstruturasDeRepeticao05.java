package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        float vlTotal = 30000;
        for (int parcela = (int) vlTotal; parcela >= 1; parcela--) {
            double valorParcela = vlTotal / parcela;

            if(valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
