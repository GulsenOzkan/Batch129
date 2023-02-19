package smallstudygroup09ocakpazartesi;

import java.util.ArrayList;
import java.util.List;

public class Ssg03_List {
    public static void main(String[] args) {
// bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0); // 3.5

        Double toplam = 0.0;
        Double ortalama = 0.0;
        for (Double w : sayilar) {
            toplam +=w;

        }
        ortalama =toplam/(sayilar.size());
        System.out.println(ortalama);

        List<Double> ortalamaUstundekiler = new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            if(sayilar.get(i) > ortalama){
                ortalamaUstundekiler.add(sayilar.get(i));
            }
        }
        System.out.println(ortalamaUstundekiler); // [5.0, 5.0, 6.0, 7.0]
    }
}
