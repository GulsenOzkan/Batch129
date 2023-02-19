package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities); // [Miami, Istanbul, Kayseri, Almaty]

        // remove() methodu index ile kullanilirsa o index'teki elemani siler
        String n = cities.remove(1);
        System.out.println(n); // Istanbul
        System.out.println(cities); // [Miami, Kayseri, Almaty]

        // remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        // remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden true veya false doner
        // Eger eleman List'te var ise o elemani siler ve size true der
        // Eger eleman List'te yok ise o elemani silemediginden ve size false der.
        cities.remove("Kayseri");
        System.out.println(cities); // [Miami, Almaty, Kayseri]
         }
}
