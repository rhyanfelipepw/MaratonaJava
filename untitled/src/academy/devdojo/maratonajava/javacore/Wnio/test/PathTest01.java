package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        final Path p1 = Paths.get("/home/rhyan/Desktop/JAVA_ESTUDO/Projetos/DEV_DOJO/untitled/arquivo/teste.txt");
        System.out.println(p1.getFileName());
    }
}
