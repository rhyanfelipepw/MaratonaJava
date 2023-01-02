package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {


    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    //CAMEL CASE PARAMETROS
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0)
            return 0;
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 == 0)
            return 0;
        else
            return num1 / num2;
    }

    // É possivel utilizar return; como break em uma função void para finalizar
    public void imprimiDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0)
            System.out.println("Não existe divisão por zero");
        else
            System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num, int num2) {
        num = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num);
        System.out.println("Num2: " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int temp : numeros) {
            soma = soma + temp;
        }
        System.out.println(soma);
    }
    // VARARGS EXEMPLO
    // VARARGS É SEMPRE O ULTIMO DOS PARAMETROS
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int temp : numeros) {
            soma = soma + temp;
        }
        System.out.println(soma);
    }
}
