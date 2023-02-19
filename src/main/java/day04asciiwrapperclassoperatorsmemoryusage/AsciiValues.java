package day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {

    // Java'da her karakterin bir sayisal degeri vardir.
    // Bu degerler ASCII deger'ler olarak adlandirilir.
    // Bu degerlerin tamaminin bulundugu tabloya "Ascii Table" denir.
    public static void main(String[] args) {

        // Herhangi bir karakterin ASCII degerini bulmak icin o karakteri "int" data type'inda bir variable'in icine koyunuz.

        int ch = 'A';
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 ='K';
        char c2 = '?';
        // Java'da char'lari matematiksel islemlerde kullanirsaniz, Java o char'larin ASCII degerlerini kullanir.
        System.out.println(c1 +c2); // 138


    }
}
