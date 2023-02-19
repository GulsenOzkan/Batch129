package day31collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args){

        /*
            "Hash" bir tekniktir, Java bu tekniği kullanarak Java benzersiz datalar üretir.
            "Set" demek tekrarsız data depolamak icin kullanilan Collection'dir.
            Set tekrar kabul etmez. Yani, tekrarsız verileri depolamak için kullanılır.

            "Set" ler 3 e ayrilir;
                 i) HashSet ==>
                    a) Super hizlidir, cunku HashSet'ler verdiginiz elemanlari siralamal icin zaman kaybetmez.
                       Yani HashSet'lere eklenen elemanlar rastgele siralanirlar.
                    b) HashSet'ler tekrarli elemana musaade etmezler.
                    c) HasSet'ler sadece 1 tane "null" i eleman olarak kabul ederler.

                 ii) LinkedHashSet ==>
                     a) LinkedHashSet elemanleri "insertion order" a gore dizer.
                     b) LikedHashSet elemanlari siralamakta zaman kaybettigi icin HashSet'e gore yavastir.
                     c) LinkedHashSet'ler tekrarli elemana musaade etmezler.

                 iii) TreeSet ==>
                      a) TreeSet elemanlari "natural order(kucukten buyuge veya alfabetik sira)" a gore dizer.
                      b) TreeSet, natural order yaparken cok zaman harcar o yuzden en yavas "Set" tir.
                      c) TreeSet'ler tekrarli elemana musaade etmezler.
         */

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);

        System.out.println(hs); // [5, 234, 12, 78] ==> Gordugunuz gibi elemanlar rastgele siralandi.

       int hc = hs.hashCode();
        System.out.println(hc); // 329







    }
}
