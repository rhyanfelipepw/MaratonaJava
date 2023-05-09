package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.TimeZone;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("/home/rhyan/Desktop/JAVA_ESTUDO/Projetos/DEV_DOJO/untitled/arquivo/file.txt");
        try {
            final boolean isCreated = file.createNewFile();
            boolean isDeleted = false;
            if(file.exists()){
                isDeleted  =  file.delete();
            }
            System.out.println("PATH" + file.getPath());
            System.out.println("Created:" + isCreated);
            System.out.println("Deleted:"+ isDeleted);
            System.out.println("isDirectory:"+ file.isDirectory());
            System.out.println("isFile:"+ file.isFile());
            System.out.println("lastModify:"+ new Date(file.lastModified()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
