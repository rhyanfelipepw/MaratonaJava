package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // PRIMEIRA CLASSE USADA NO JAVA PARA ABORDAR AS DATAS UTILIZANDO MILISEGUNDOS COMO PARAMETRO.
        Date date = new Date(1_000_000_000L);
        date.setTime(date.getDate() + 3_600_000);
        System.out.println(date);
    }
}
