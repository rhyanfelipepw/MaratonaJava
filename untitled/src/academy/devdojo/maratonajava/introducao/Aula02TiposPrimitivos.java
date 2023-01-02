package academy.devdojo.maratonajava.introducao;

/**
 * Estudo de tipos <b>Primitivos</b>
 */
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // 8 Primitives
        // int, double, float, char, byte, short, long e boolean
        int idade = 20; // 4 BYTES 32 BITS
        long numeroGrande = 100000; // 8 BYTES 64 BITS
        double salarioDouble = 2000.0; // 8 BYTES 64 BITS
        float salarioFloat = 2500.0F; // 8 BYTES 64 BITS
        byte idadeByte = 100 ; // 1 BYTE 8 BITS
        short idadeShort = 10; // 2 BYTES  16 BITS
        boolean verdadeiro = true; // 1 BIT
        boolean falso = false; // 1 BIT
        char caractere = 'M'; // 2 BYTES  16 BITS
        char caractereNumero = 64;
        char caractereUniCode = '\u0041';

        // CASTING = FORÇAR O TIPO A ALOCAR NA VARIAVEL
        // CASO O TAMANHO EXCEDA O VALOR O RESULTADO É IMPREVISIVEL (Irá cortar a quantidade de bits).
        int testIntCasting = (int) numeroGrande; // LONG
        float testFloatCasting = (float) salarioDouble; // DOUBLE
        long testLongCasting = (long) salarioDouble; // DOUBLE;

        String nome = "Rhyan";

        System.out.println("a idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println("Oi meu nome é " + nome);
    }
}
