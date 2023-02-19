package day07ifstatements.day06stringmanupulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {

        // EXAMPLE 1: Bir String'in bas ve sonunda space karakteri varsa siliniz
        //                "      Ali Can    " ==> "Ali Can"
        String s = "   ali cAN  ";
        System.out.println(s);

        // trim() method'u bir String'in bas ve sonundaki space'leri siler aradakilere dokunmaz.
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        // EXAMPLE 2: Asagida fiyatlari verilen urunlerin toplam fiyatlarini bulunuz.
        //            String tv = "$456.99"; String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$","");
        System.out.println(tv2); // 456.99

        String laptop2 = laptop1.replace("$","");
        System.out.println(laptop2); // 875.99

        Double totalPrice = Double .valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice); // 1332.98

        // EXAMPLE 3: Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdiriniz.
        //              "Ali Can" ==> AC

        String name = "  Ali Can  ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first); // A

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second); // C

        System.out.println("" + first + second); // AC

        // EXAMPLE 4: Bir Sring'in hic karakter icermedigini (bos String) kontrol eden kodu yaziniz
        String str = "";

        // 1. YOL: length() kullan
        boolean result1 = str.length()==0;
        System.out.println("String bos mu? " + result1); // String bos mu? true

        // 2. YOL:
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu? " + result2); // String bos mu? true

        // EXAMPLE 5: Bir String space haric hicbir karakter icermedigini kontrol eden kodu yaziniz

        String t = "     ";

        // 1. YOL:
       boolean result3 = t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var? " + result3);  // Sadece space mi var? true

        // 2. YOL:
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println("Sadece space mi var? " + result4); //Sadece space mi var? true

        // 3. YOL:
        // isBlank() methodu sadece space iceren String'ler icin true verir, space icemezse false verir.
        // isBlank() methodu bos String'ler icin de true verir
        // isBlank()  ==> space + hicbir sey icin true verir.      isEmpty() hicbir sey icin true verir.
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var? " + result5); // Sadece space mi var? true

        // EXAMPLE 6: Bir String'de a, e, i karakterlerinin ilk gorunumlerinin index'leri toplamini ekrana yazdiriniz
        //              "Java is easy to learn" ==>  1 + 5 + 8 = 14

        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA); // 1

        int idxI = r.indexOf('i');
        System.out.println(idxI);  // 5

        int idxE = r.indexOf('e');
        System.out.println(idxE); // 8

        System.out.println("Index'ler toplami: " +(idxA + idxE + idxI)); //Index'ler toplami: 14

        // EXAMPLE 7: Bir String'de "Java" kelimelerinin ilk kacinci index'de kullanildigini yaziniz.
        //              "Ah Java vah Java sensiz olmuyor Java" ==> 3

        String u =  "Ah Java vah Java sensiz olmuyor Java";
        // indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin index'ini (yani J nin) almis olursunuz
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava); // 3

        // indexOf() methodu olmayan karakterler icin kullanilirsa her zaman -1 verir.
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz); // -1

        // EXAMPLE 8: Bir String'de a, e, i karakterlerinin son gorunumlerinin index'leri toplamini ekrana yazdiriniz
        //              "Java is easy to learn" ==>  18 + 5 + 17 = 40

        String v = "Java is easy to learn";

        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA); // 18

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE); // 17

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI); // 5

        System.out.println("Index'ler toplami: " +(idxOfA + idxOfE + idxOfI)); // 40

        // lastIndexOf() methodu olmayan karakterler icin kullanilirsa her zaman -1 verir.

        // EXAMPLE 9: Bir String'deki tekrarsiz karakterleri ekrana yazdiriniz.
        //         abbccdc ==> ad

        String y = "abb";

        char ch1 = y.charAt(0);
        if(y.indexOf(ch1)== y.lastIndexOf(ch1)){
            System.out.println(ch1); // a
        }
        char ch2 = y.charAt(1);
        if(y.indexOf(ch2)== y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if(y.indexOf(ch3)== y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        // NOTE: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //       Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
        //       if you study hard, you will learn Java.

        // EXAMPLE 10: Sayi pozitifise ekrana pozitif yazdirin
        int num = 12;

        if(num>0){
            System.out.println("Pozitif");
        }

        // EXAMPLE 11: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin.

        int number = 3;

        if (number > -1 && number < 10) {
            System.out.println("Rakam");
        }

        // EXAMPLE 12: Sayi uc basamakli ise ekrana "Woow!" yazdirin

        int n = 123;

        n =  Math.abs(n);

        if(n>99 && n<1000 ){
            System.out.println("Woow!");
        }




















    }
}
