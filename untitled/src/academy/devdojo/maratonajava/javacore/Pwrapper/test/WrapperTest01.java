package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        // PRIMITIVOS
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 10F;
        double doubleP = 10D;
        char charP= 'w';
        boolean booleanP = false;


        // WRAPPERS
        Byte byteW= 1;
        Short shortW= 1;
        Integer intW= 1; // AUTOBOXING
        Long longW= 1L;
        Float floatW= 10F;
        Double doubleW= 10D;
        Character charW = 'w';
        Boolean booleanW= false;

        int i = intW.intValue(); // UNBOXING
        Integer intW2 = Integer.parseInt("1"); // UNBOXING
        Boolean  booleanW2 =  Boolean.parseBoolean("False");
        System.out.println(booleanW2);

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('!'));

    }
}
