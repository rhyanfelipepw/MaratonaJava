package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04
{
    public static void main(String[] args) {
        float salarioAnual = 7000;
        float primeiraFaixa =  9.70F / 100;
        float segundaFaixa =  37.35F / 100;
        float terceiraFaixa =  49.50F / 100;
        float valorDoImposto;

        if(salarioAnual <= 34712){
            valorDoImposto = salarioAnual * primeiraFaixa;
        } else if(salarioAnual <= 68508){
            valorDoImposto = salarioAnual * segundaFaixa;
        }else {
            valorDoImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorDoImposto);
    }
}
