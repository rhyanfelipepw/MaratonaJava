package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isosCountries = Locale.getISOCountries();
        String[] isosLanguages = Locale.getISOCountries();

        for (String isoLanguage: isosLanguages) {
            System.out.println(isoLanguage + " ");
        }

        for (String isosCountrie: isosCountries) {
            System.out.println(isosCountrie + " ");
        }
    }
}
