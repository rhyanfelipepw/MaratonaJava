package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);

        String username = "Rhyan";
        String senha = "123456";

        System.out.println("Usuário");
        String userNameDigitado= scanner.next();
        System.out.println("Senha");
        String senhaDigitado= scanner.next();

        if (!username.equals(userNameDigitado) && !senha.equals(senhaDigitado)){
            throw new LoginInvalidoException();
        }
        System.out.println("Usuário logado com sucesso");

    }
}
