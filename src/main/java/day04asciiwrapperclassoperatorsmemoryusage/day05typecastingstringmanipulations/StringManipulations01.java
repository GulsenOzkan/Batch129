package day04asciiwrapperclassoperatorsmemoryusage.day05typecastingstringmanipulations;

public class StringManipulations01 {

    // String bir Non-Primitive data type'dir ve ayni zamanda bir Class'tir.

    public static void main(String[] args) {

        String s = "Java is easy";

        // EXAMPLE 1: "s" String'indeki tum karakterleri buyuk harf yapin.

        String sUpper = s.toUpperCase();
        System.out.println(sUpper); // JAVA IS EASY

        // EXAMPLE 2: "s" String'indeki tum karakterleri kucuk harf yapin.
       String sLower = s.toLowerCase();
        System.out.println(sLower); // java is easy

        // EXAMPLE 3: "s" String'indeki ilk karakterii aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar); // J

        // EXAMPLE 4: "s" String'indeki ikinci ve sondan ikinci character'i alin ve ekrana yazdirin.
        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);

        // 1. YOL: Ayni satirda yazdirmak icin
        System.out.print(secondChar);
        System.out.println(secondLastChar); // as

        // 2. YOL: Ayni satirda yazdirmak icin
        System.out.println("" + secondChar + secondLastChar); // as

        // EXAMPLE 5: "s" String'inde kullanilan karakter sayisini bulunuz
        int sLength = s.length();
        System.out.println(sLength); // 12

        // EXAMPLE 6: "s" String'indeki ilk 4 karakteri aliniz.

        // substring (0, 4) ==> yani "0" yani ilk index dahil, "4" yani ikinci index haric
        String sub1 = s.substring(0,4);
        System.out.println(sub1); // Java

        // EXAMPLE 7: "s" String'indeki "is" kelimesini alin

        String sub2 = s.substring(5, 7);
        System.out.println(sub2); // is

        // EXAMPLE 8: "s" String'indeki "easy" kelimesini alin

        String sub3 = s.substring(8, 12);
        System.out.println(sub3); // easy

        // Bir karakterden baslayip String'in sonuna kadar almak isterseniz, ikinci index'i yazmayiniz.
        // s.subtring(8, 12); yerine s.subtring(8); yaziniz
        String sub4 = s.substring(8);
        System.out.println(sub4); // easy

        // EXAMPLE 9: "s" String'inde "money" kelimesinin var olup olmadigini kontrol ediniz.
        boolean isExist = s.contains("money");
        System.out.println(isExist); // false

        /*
            Bir method'u ogrenirken 3 sey mutlaka yapin
                i) Bu method ne is yapar?
                ii) Bu method'un farkli kullanimlari nasildir?
                iii) Bu method size ne return eder?
         */

        // EXAMPLE 10: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart); // true

        // EXAMPLE 11: "s" String'inin 6. karakterden itibat=ren  belli bir harfle baslayip baslamadigini kontrol ediniz.
      boolean isBegin =  s.startsWith("i", 5);
        System.out.println(isBegin); // true













































    }
}
