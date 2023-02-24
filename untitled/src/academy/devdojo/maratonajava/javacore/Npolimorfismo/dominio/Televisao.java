package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto {

    public static final double IMPOSTO_PORCENTO = 0.20;


    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisão");
        return this.valor * IMPOSTO_PORCENTO;
    }
}
