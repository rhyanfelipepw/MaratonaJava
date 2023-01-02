package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // Operador negação !
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }// INSTRUÇÃO DEPENDENTE
        else{
            System.out.println("Não autorizado bebida alcólica");
        }
        // INSTRUÇÃO INDEPENDENTE
        if(!isAutorizadoComprarBebida) {
             System.out.println("Não autorizado bebida alcólica");
        }

        boolean c = false;
        // Irá executar
        if(c = true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        // Possivel mas não recomendado.
        if(true) System.out.println("Dentro do if");
        System.out.println("Fora do if");
    }
}
