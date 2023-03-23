package academy.devdojo.maratonajava.javacore.QString.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome  = "Rhyan";
        nome.concat("Felipe Guarato");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Rhyan"); // 16 CARACTERES CRIADOS POR PADRAO SEM DECLARAR. PASAR ELE MULTIPLICA.
        sb.append(" Felipe Guarato");
        sb.reverse();
        sb.reverse();

        sb.delete(0,3);
        System.out.println(sb);


    }
}
