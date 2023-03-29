package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo");
        }
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
        Date time = c.getTime();



        c.add(Calendar.DAY_OF_MONTH, 2);
        c.roll(Calendar.HOUR, 2);
        System.out.println(time);



    }
}
