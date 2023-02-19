package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {

    /*
        1) Map'ler "USA = 400,000,000" seklinde data depolamamiz gerektiginde kullanilir.
        2) "USA = 400,000,000" datasinin "USA" kismi "key" olarak adlandirilir ve "key"lar unique'tir.
        3) "USA = 400,000,000" datasinin "400,000,000" kismi "value" olarak adlandirilir ve "value" tekrarli olabilir.
        4) Map'lerde depoladiginiz her bir data'ya "Entry" denir, "Eleman" denmez.
        5) "Entry'ler "unique"tir. Cunku key kisimlari unique oldugundan herbir "Entry" digerlerinden farklidir.
        6) "HashMap" cok hizlidir cunku "HashMap"ler "entry"leri siralamak ile ugrasmazlar.
        7) "HashMap"lerde bir tane "key"i "null" yapabilirsiniz.
        8) "HashMap"lerde birden fazla "value" yu "null" yapabilirsiniz.
        9) "HashMap" ler " multi thread" icin kullanilamaz ve "synchronization" yoktur.
     */
    public static void main(String[] args) {

        // HashMap nasil olusturulur?

        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm); // {}

        hm.put("USA", 400000000);
        hm.put("Germany", 83200000);
        hm.put("Albania", 3000000);
        System.out.println(hm); // {USA=400000000, Germany=83200000, Albania=3000000}
        hm.put("Albania", 2812000);
        System.out.println(hm); // {USA=400000000, Germany=83200000, Albania=2812000}
        // Ayni key i kullarak yeni bir entry eklerseniz var olan value'yu update etmis olursunuz
        hm.put(null, 12000000);
        System.out.println(hm); // {null=12000000, USA=400000000, Germany=83200000, Albania=2812000}
        hm.put(null, 18000000);
        System.out.println(hm); // {null=18000000, USA=400000000, Germany=83200000, Albania=2812000}
        hm.put("Mynbar", null);
        hm.put("Bhutan", null);
        System.out.println(hm); // {null=18000000, Mynbar=null, USA=400000000, Bhutan=null, Germany=83200000, Albania=2812000}

        // HashMap'lerde sadece "key"leri almak istiyorum.

        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys); // [null, Mynbar, USA, Bhutan, Germany, Albania]

        // HashMap'lerde sadece "value"lari almak istiyorum.

        // EXAMPLE 1: hm Map'indeki ulkelerin toplam nufusunu bulunuz.

        Collection<Integer> hmValues = hm.values();
        int sum = 0;

        for (Integer w : hmValues) {
            if (w != null) {
                sum = sum + w;
            }
        }
        System.out.println(sum); // 504012000

        // HashMap'lerde belirli bir "key" in "value"sunu nasil alabiliriz.
        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation); // 400000000

        // HashMap'lerde replace() methodu varolan bir"key" nin, "value" sunu degistirmek icin kullanilir.
        hm.replace("Bhutan", 35000000);
        System.out.println(hm); // {null=18000000, Mynbar=null, USA=400000000, Bhutan=35000000, Germany=83200000, Albania=2812000}

        hm.putIfAbsent("USA", 700000000);
        System.out.println(hm); // {null=18000000, Mynbar=null, USA=400000000, Bhutan=35000000, Germany=83200000, Albania=2812000}
        hm.putIfAbsent("India", 700000000);
        System.out.println(hm); // {null=18000000, Mynbar=null, USA=400000000, Bhutan=35000000, Germany=83200000, Albania=2812000, India=700000000}

        // EXAMPLE 2: Yeni ogretmenin maasi standart ucretten 1000TL fazla,
        // eski ogretmenin maasi standart ucretten 2000TL fazla olsun.

        HashMap<String, Integer> salaries = new HashMap<>();

        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);


        String teacherName = "Tom";

        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);
        } else {
            salaries.putIfAbsent(teacherName, 11000);
        }

        System.out.println(salaries);

        // replace ("USA", 400000000,500000000 ) methodu value yu degistirir
        hm.replace("USA", 400000000, 500000000);
        System.out.println(hm); // {null=18000000, Mynbar=null, USA=500000000, Bhutan=35000000, Germany=83200000, Albania=2812000, India=700000000}

        // getOrDefault() olan "key" lerin degerini verir,
        // olmayan "key" ler icin de sizin ikinci parametreye yazdiginiz degeri verir.
        Integer r = hm.getOrDefault("Bhutan", 0);
        System.out.println(r); // 35000000

        // entrySet() methodu "Map"i "Set" e cevirir.
        // Setlerin methodlarini kullanabilmek icin entrySet() method'u ile Map'i Set'e cevirebiliriz.
        // Map'i Set'e cevirdigimizde Set'in tum ozelliklerini kullanabiliriz. Mesela loop gibi.
        // entrySet() methodunu kullandiginizda elde ettiginiz Set'in elemanlari "Map.Entry<String, Integer>" seklinde bir Map olur.
        // Bu yuzden elemanlar icin Map method'leri kullanilabilir
        Set<Map.Entry<String, Integer>> myEntries = hm.entrySet();
        System.out.println(myEntries); // [null=18000000, Mynbar=null, USA=500000000, Bhutan=35000000, Germany=83200000, Albania=2812000, India=700000000]

        // EXAMPLE 3: Ulke ismindeki karakter sayisini ulke nufusuna ekleyen ve sonucu consola yazdiran kodu yaziniz.

        for (Map.Entry<String, Integer> w : myEntries) {

            if (w.getValue() != null && w.getKey() != null) {

                int toplam = w.getValue() + w.getKey().length();
                System.out.println(toplam);
            }


        }
    }
}
