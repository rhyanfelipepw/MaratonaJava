package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquiv();
    }

    private static void criarNovoArquiv(){
        File file = new File("arquivo/teste.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreated);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
