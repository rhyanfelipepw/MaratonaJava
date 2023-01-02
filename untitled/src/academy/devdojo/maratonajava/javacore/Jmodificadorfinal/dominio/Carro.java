package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;
/**
 * Classe que não pode ser herdada contém o final
 */
public class Carro {
    private  String nome;
    public static final double VELOCIDADE_LIMITE = 250;

    public final Comprador COMPRADOR = new Comprador();

    // Metodos  com final não podem ser sobrescritos por subClasses.
    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
