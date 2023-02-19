package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        /*
            1) interface'lerden object olusturulamaz cunku interface'lerin constractor'u yoktur.
            2) Abstract Class'larda object olusturulamaz. Constractor vardir ama object olusturmada kullanilamaz.
            3) interface'lerin constractor'lari olmadigindan collection olustururken
               interface isimleri "new" keyword'unden sonra kullanilamaz.
            4) class --> class ==> extends
               class --> interface ==> implement
               interface --> interface ==> extends
               interface --> class ==> Bu mumkun degildir.
         */

        // ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar.
        // Bu yuzden eleman silme ve ekleme islemleri coklukla yapilacaksa ArrayList kullanmak tavsiye edilmez.

        // LinkedList'ler index kullanmadiklarindan eleman silmede ve eklemede re-index yapilmasina gerek yoktur.
        // Bu da LinedList'leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin
        // cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.

        // ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
        // LinkedList'lerde "search" islemi zor yapilir. Cunku LinkedList'ler index kullanmaz,
        // index kullanmayinca herhangi bir elemani bulmak icin butun elemanlar en bastan kontrol edilir.
        // Bu da cok fazla is demektir.


        List<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");

        System.out.println(names); // [Steve, Ajda, Raj, Megan, Brandon]

        // add() method'u her zaman sona ekler.

        names.addFirst("Cuneyt");
        System.out.println(names); // [Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda"); // "add() methoduyla "addLast()" methodu ayni seyi yapar. Sona ekler.
        System.out.println(names); // [Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(3,"Suleyman");
        System.out.println(names); // [Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda");
        System.out.println(names); // [Cuneyt, Steve, Suleyman, Raj, Megan, Brandon, Ajda]
                                   // ==> Ilk "Ajda" yi siler. Ve loopu kirar.

        names.remove(4);
        System.out.println(names); // [Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

        names.add("Suleyman");
        names.add("Suleyman");

        System.out.println(names); // [Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman]

        String r1 = names.remove(); // Retrieves and removes the head (first element) of this list. Ilk elemani siler vesize verir
        System.out.println(r1); // Cuneyt
        System.out.println(names); // [Steve, Suleyman, Raj, Brandon, Ajda, Suleyman]

        names.removeFirstOccurrence("Suleyman");
        System.out.println(names); // [Steve, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeLastOccurrence("Suleyman");
        System.out.println(names); // [Steve, Raj, Brandon, Ajda, Suleyman]


       // Retrieves, but does not remove, the head (first element) of this list. (Copy + Paste)
        // ==> Ilk elemani silmeden size verir

       // Return: the head of this list, or null if this list is empty

       String r2 = names.peek();
        System.out.println(r2); // Steve
        System.out.println(names); // [Steve, Raj, Brandon, Ajda, Suleyman]

        //Retrieves and removes the head (first element) of this list. (Cute + Paste)
        //Returns: the head of this list, or null if this list is empty
        // remove() bos linkedList'te kullanilirsa "hata" verir.
        // poll() bos linkedList'te kullanilirsa "null" verir.
        names.poll();

        // Pops removes and returns the first element of this list. (Cut + Paste)
        // This method is equivalent to removeFirst().
        names.pop();



    }
}
