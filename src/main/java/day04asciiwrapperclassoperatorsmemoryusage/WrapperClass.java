package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {
    public static void main(String[] args) {

        // primitive: char - boolean - byte - short - int - long - float - double
        // Wrapper Class: Character - Boolean - Byte - Short - Integer - Long - Float - Double
        // Wrapper Class'lar non-primitive'dir o yuzden cok yer kaplarlar, o yuzden sart degilse
        // Wrapper Class kullanmayi tercih etmeyiz.

        int n = 12; // "n" yazip nokta koyarsaniz hic method goremezsiniz, cunku "primitive' ler method icermez.
        Integer m = 12; // "m" yazip nokta koyarsaniz hic method gorursunuz, cunku "Wrapper class" lar nethod icerir.

        byte p = 23;
        Byte r = 43;

        // EXAMPLE 1: short data type'nin minimum ve maximum degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort); // 32767
        short minShort = Short.MIN_VALUE;
        System.out.println(minShort); // -32768

        // EXAMPLE 2: int data type'nin minimum ve byte data type'nin maximum degerlerinin toplamini veren kodu yazarak bulunuz.
        int intMin = Integer.MIN_VALUE;

        byte byteMax = Byte.MAX_VALUE;

        System.out.println("Toplam: " + (intMin +byteMax)); //-2147483521

        // EXAMPLE 3: i)Primitive int'i Wrapper Integer'a cevirin ==> AUTOBOXING
        int num = 22;

        Integer wrapperNum = num;

        System.out.println(wrapperNum); // 22

        //          ii) Wrapper Byte'i primitive byte'a cevirin ==> UNBOXING
        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK); // 43

        // EXAMPLE 4: i)Primitive char'i Wrapper Character'e cevirin ==> AUTOBOXING
        char initial = 'T';
        Character initialWrapper = initial;
        //          ii) Wrapper Boolean'i primitive boolean'a cevirin ==> UNBOXING
        Boolean isOld = true;
        boolean isOldWrapper = isOld;

        // EXAMPLE 5: size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz.

        String shirt = "2300";
        String shoes = "5200";

        // Java'da "+" sembolu iki sayi arasinda kullanilirsa toplama olur
        // Java'da "+" sembolu iki String arasinda kullanilirsa "concatination islemi" birlestirme yapar.
        // NOTE: Concatination islemlerinde Java matematikteki islem onceligi kurallarini kullanir.
        // Islem onceligi kurallari: i) Once uslu sayilar ii) Parantez ici islemler iii) Carpma ve bolme iv) Toplama ve cikarma
        System.out.println(shirt + shoes); // 23005200

       int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat); // 7500

        // EXANPLE 6: size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz.
        // NOTE: valueOf() methodu tum karakterleri rakam olan String'leri sayilara cevirir.
        //       Eger valueOf() methodu kullanirken String'in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz
        //       Bu hatayi duzeltmeyi ileride ogrenecegiz

        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio); // $11000$3000

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);
















    }
}
