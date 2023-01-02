package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    // Variaveis de escopo local precisam ser obrigatoriamente inicializadas antes de executaer
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 17;
        String categoria;

        if(idade < 15){
            categoria = "Categoria Infantil";
        }else if(idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }

        // Exemplo utilizando condição ternária
        categoria =  idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ?  "Categoria Juvenil" : "Categoria Adulto";

        System.out.println(categoria);


    }
}
