package day04asciiwrapperclassoperatorsmemoryusage.day05typecastingstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        // EXAMPLE 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd); // true

        // EXAMPLE 2: "s" String'deki "money" kelimesini "dolar" kelimesine cevirin.
        String s1 = s.replace("money", "dolar");
        System.out.println(s1); // Learn Java earn dolar

        // EXAMPLE 3: "s" String'deki "earn" kelimesini "win" kelimesine cevirin.
        String s2 = s.replace("earn", "win");
        System.out.println(s2); // Lwin Java win money

        // EXAMPLE 4: "s" String'indeki "a" harflerini "*" a cevoriniz
        // NOTE: replace method'unda coklu karakter ile calisirsaniz mecbur "" cift tirnak kullanilir.
        //       Ama tek karakter ile calsirsaniz cift tirnak veya tek tirnak kullanilir. Tercihen tek tirnak kullanilir.

        String s3 = s.replace("a", "*");
        System.out.println(s3); // Le*rn J*v* e*rn money

        // NOT: Ama ya ikisi de tek tirnak yada ikiside cift tirnak olmalidir.
        // EXAMPLE 5: "s" String'indeki "n" harflerini "XXX" a cevirin.
        String s4 = s.replace("n","XXX");
        System.out.println(s4); // LearXXX Java earXXX moXXXey

        // EXAMPLE 6: "s" String'indeki tum "e" harflerini siliniz
        // NOTE: "Hicbir sey" char data type'inda yok bu yuzden replace() method'u kullanarak silme islemi
        // yaparsaniz mutlaka cift tirnak kullanilir.
        String s5 = s.replace("e", "");
        System.out.println(s5); // Larn Java arn mony



        String t = "Ali 13 yasindadir!...";

        // EXAMPLE 7: "t" String'indeki tum rakamlari (0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz
        // NOTE: Bir grup data type'ini degistirmek icin replaceAll() method'u kullanilir
        // NOTE: Bir grup data'yi ifade etmek icin "Regular Expressions" (Regex) kullaniriz
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1); // Ali ** yasindadir!...

        /*
            Meshur Regex'ler
            1) Tum rakamlar ==> [0-9]
            2) Tum kucuk harfler ==> [a-z]
            3) tum buyuk harflar ==> [A-Z]
            4) Tum kucuk ve buyuk harfler ==> [a-zA-Z]
            5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
            6) Tum noktalama isaretleri ==> \\p{Punct}
            7) Tum sesli harfler ==> [aeiou]
                x,q,w harfleri ==> [xqw]

            8) Kucuk harflerden farkli tum karakterler ==> [^a-z]
            9) Tum harflerden farkli tum karakterler ==> [^a-zA-Z]
            10) Space disindaki tum karakterler ==> \\S


            */

        // EXAMPLE 8: "t" String'indeki tum rakamlari ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2); // !!! !! !!!!!!!!!!!...

        // EXAMPLE 9: "t"String'indeki tum sesli harfleri "?" e ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3); // ?l? 13 y?s?nd?d?r!...

        // EXAMPLE 10: "t" String'indeki tum kucuk harfler disindaki tum karakterleri "<>" ceviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4); // <>li<><><><>yasindadir<><><><>

        // EXAMPLE 11: "t" String'indeki tum harfler disindaki tum karakterleri "+" ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5); // Ali++++yasindadir++++

        // EXAMPLE 12: "t" String'indeki tum space'ler disindaki tum karakterleri "+" ceviriniz
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6); // +++ ++ ++++++++++++++

        // EXAMPLE 13: "t" String'indeki sasli harfler disindaki tum karakterleri "&" e cevirin
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7); // A&i&&&&&a&i&&a&i&&&&&




    }
}
