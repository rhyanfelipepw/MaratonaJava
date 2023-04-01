package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        NumberFormat[] nfa = new NumberFormat[4];


        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);


        double vl = 10_0000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(vl));
        }

        String vlString = "1_000.2130";
        try {
            System.out.println(nfa[0].parse(vlString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
