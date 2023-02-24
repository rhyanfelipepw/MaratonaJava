package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate  extends Produto{
    public static final double IMPOSTO_PORCENTO = 0.05;
    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * IMPOSTO_PORCENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
