package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro("BMW", 300);
        Carro carro02 = new Carro("MERCEDES", 320);
        Carro carro03 = new Carro("Audi", 320);

        // Variáveis estáticas afetam todos os objetos em existência uma vez que fazem parte da classe
        Carro.setVelocidadeLimite(180);


        carro01.imprime();
        carro02.imprime();
        carro03.imprime();

    }
}
