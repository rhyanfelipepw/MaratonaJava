package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.test;

import java.util.ArrayList;
import java.util.List;

public class Teste01 {
    public static void main(String[] args) {
        String teste = "mnes__ya_____mi";
        int numbersRows = 3;

        int caracteresPorLinha = teste.length() / numbersRows;


        String concatenado = "";

        List<String> lista = new ArrayList<String>();

        for(int i = 0; i < numbersRows; i++){
            int comeco = i * caracteresPorLinha;
            int fim = comeco  + caracteresPorLinha;
            lista.add(teste.substring(comeco, fim));
        }

        for (String s : lista) {
            System.out.println(s);
        }
        for(int i = 0; i < lista.size() ; i++){
            for (int j = 0; j < lista.get(i).length(); j++){
                concatenado = concatenado + lista.get(i).charAt(j);
            }
        }

        System.out.println(concatenado);



    }
}
