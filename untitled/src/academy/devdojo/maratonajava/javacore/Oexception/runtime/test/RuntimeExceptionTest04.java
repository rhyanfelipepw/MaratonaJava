package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException exception ){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e ){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }


        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
           e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws FileNotFoundException, SQLException {

    }

}
