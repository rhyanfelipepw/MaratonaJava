package academy.devdojo.maratonajava.javacore.QString.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        Long inicio = System.currentTimeMillis();
        concatString(30_000);
        Long fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para string: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(3_000_000);
        fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(3_000_000);
        fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + "ms");
    }



    private static void concatString(int tamanho){
        String text = "";
        for (int i = 0; i < tamanho ; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder text = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho ; i++) {
            text.append(i);
        }
    }

    // Ambiente multi-thread
    private static void concatStringBuffer(int tamanho){
        StringBuilder text = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho ; i++) {
            text.append(i);
        }
    }
}
