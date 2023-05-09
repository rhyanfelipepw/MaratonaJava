package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,123";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int i =  scanner.nextInt();
            }else if(scanner.hasNextBoolean()){
                boolean i = scanner.nextBoolean();
            }
        }
    }
}
