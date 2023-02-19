package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 12; // Bu yapinin icinde sadece bir tane data depolanabilir.

        // Ama biz kod yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        // Bir yapinin icinde coklu data depolayabilmek icin Java "Array" yapisini olusturmustur.

        //Array nasil olusturulur?
        // Array olusturmak icin Array elemanlarinin "data type" i ve "eleman sayisi" mutlaka yazilmalidir.

        String stdNames [] = new String[5];

        //toString() method'unu kullanmadan sadece array ismi ile yazdirirsaniz Java o Array'in adresini yazdirir.
        System.out.println(Arrays.toString(stdNames));

        // Array'e eleman ekleme nasil yapilir?

        stdNames[0] = "Cuneyt";
        stdNames[1] = "Kemal";
        stdNames[2] = "Ajda";
        stdNames[3] = "Ezel";
        stdNames[4] = "Besir";

        System.out.println(Arrays.toString(stdNames)); // [Cuneyt, Kemal, Ajda, Ezel, Besir]

        // Array'den specific bir elemani almak.

        System.out.println(stdNames[2]); // Ajda

        // EXAMPLE 1: Array'deki her elemani sonuna "!" isareti koyarak ekrana yazdiriniz.

        for(int i = 0; i < stdNames.length; i++){
            System.out.print(stdNames[i] + "! "); // Cuneyt! Kemal! Ajda! Ezel! Besir!
        }

       


























    }
}
