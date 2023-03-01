package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeException02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("CODIGO FINALIZADO");
    }

    /**
     *
     * @param a
     * @param b nao pode ser zero
     * @return
     * @Throws IllegalArgumentException caso seja 0
     */
    private static int divisao(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, nao pode ser 0");
        }
        return a / b;
    }
}
