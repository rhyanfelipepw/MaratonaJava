package academy.devdojo.maratonajava.introducao;

/**
 * <b>Operadores</b>
 */
public class Aula04Operadores {
    public static void main(String[] args) {
        // OPERADORES ARITMETICOS
        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        // Operador fazendo adição //
        System.out.println(numero02 + numero01); // "30"
        // Apartir da string o operador assume a função de concatenar
        System.out.println(numero02 + numero01 +  "Valor:" + numero02 + numero01); // "30 Valor 2010"

        // Resultado da divisão de numeros inteiros sempre será um numero inteiro
        double resultado = numero02 / numero01; // 0.0

        // Resultado correto esperado
        double resultadoCorreto  = numero02 / (double) numero01; // 0.5

        // % RESTO
        // EXEMPLO DE USO PARA SABER SE É PAR OU IMPAR SE FOR 0 PAR SE FOR 1 IMPAR
        int resto = 20 % 2; // 0 PAR
        System.out.println(resto);

        // OPERADORES RELACIONAIS //
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 20;
        boolean isDezIgualDez = 10 == 20;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
        System.out.println("isDezIgualDez " + isDezIgualDez);

        // OPERADORES LÓGICOS //
        // && (AND)  || (OR) ! (LOGICAL NOT)

        int idade = 29;
        float salario = 3500F;

        boolean  isDentroDaLeiMaiorQueTrinta = idade >= 35 && salario >= 4612F;
        boolean isDentroDaLeiMenorQueTrinta = idade <=  30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        float saldoContaPoupanca = 10000F;
        float saldoContaCorrente = 200F;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = saldoContaCorrente > valorPlaystation || saldoContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // OPERADORES DE ATRIBUIÇÃO
        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;    // 3600
        bonus /= 2;    // 900
        bonus %= 2;    // 0

        System.out.println(bonus);

        // OPERADORES UNÁRIOS
        // ++ --
        int contador = 0;
        contador ++; //
        contador --; //
        // Executa a operação antes
        ++contador;
        --contador;



        System.out.println(contador);
    }
}
