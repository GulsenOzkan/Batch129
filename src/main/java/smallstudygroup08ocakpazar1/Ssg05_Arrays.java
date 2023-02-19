package smallstudygroup08ocakpazar1;

public class Ssg05_Arrays {
    public static void main(String[] args) {
/*
5.soru Verilen bir int array'deki en buyuk sayiyi yazdiran bir method olusturun.
 */
        int sayilar[]={2,1,3,4,5,6};

        maxSayiyiYazdir(sayilar);
    }public static void maxSayiyiYazdir(int [] sayilar){
        int maxSayi=sayilar[0];
        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }

        }
        System.out.println(maxSayi);
        }
    }

