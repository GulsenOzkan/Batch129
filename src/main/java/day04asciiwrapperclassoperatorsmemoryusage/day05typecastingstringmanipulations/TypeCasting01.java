package day04asciiwrapperclassoperatorsmemoryusage.day05typecastingstringmanipulations;

public class TypeCasting01 {

    /*
        Numeric primitive data type'larin birbirine donusturulmesine "Type Casting" denir.
        Numeric (sayisal) Data Type'lar ==> byte - short - int - long - float - double.

        NOTE 1: Kucuk data type'larini buyuk data type'larina cevirmeyi Java otomatik olarak  yapabilir.
                Bu isleme "Autowidening" (otomatik genisletme) denir.

        NOTE 2: Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir. Java bu riskli isi otomatik olarak yapmaz.
                Bu islemi kod yazanlar yapar.
                Bu isleme "ExplicitNarrowing" (Aciktan daraltma) denir.
     */
    public static void main(String[] args) {

        // byte data type'ini int data type'ina ceviriniz.
        byte age = 13;

        int ageInt = age; // Autowidening

        // long data type'ini short data type'ina cevirin.
        long weight = 234;

        short weightShort = (short)weight; // ExplicitNarrowing

        // int data type'ini float data type'ina cevirin.
        int population = 700000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);

        // double data type'ini short data type'ina cevirin.
        double number = 12.234;
        System.out.println(number); // 12.234
        short numberShort = (short)number;
        System.out.println(numberShort); // 12

        // Dikkat!!!
        // Donusum yaptiginiz sayi(260), donuseceginiz data type'inin sinirlari disinda ise
        // Java kullandiginiz sayi ile "mod" islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur

        //EXEMPLE 1:

        short num = 260;
        System.out.println(num); // 260
        byte numByte = (byte)num;
        System.out.println(numByte); // 4

        // EXEMPLE 2:
        short n = 1023;
        System.out.println(n); // 1023
        byte nByte = (byte)n;
        System.out.println(nByte); // -1









    }
}
