package academy.devdojo.maratonajava.javacore.Aintroucaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroucaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "MUSTANG";
        carro.modelo = "GT";
        carro.ano = 1995;

        carro.nome = "SHELBY";
        carro.modelo = "GT";
        carro.ano = 1962;



        System.out.println("Nome: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.ano);
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);



    }
}
