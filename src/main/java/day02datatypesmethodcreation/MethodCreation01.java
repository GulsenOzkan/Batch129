package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
          Java'da method nasil olusturulur?

          1) main method'un disinda olusturulur.
          2) Access Modifier + Return Type + Method Ismi + () + {}

          Olusturulan method'lar nasil kullanilir?

          1) main method'un icinden kullanilir
          2) Method'un ismini yazin + () yazin
          3) Islem yapacaginiz sayilari parantezin icine koyun
     */
    public static void main(String[] args) {


        int sonuc = add(3, 5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2, 5, 8);
        System.out.println(ucluSonuc);

        double sayininKupuSonuc = sayininKupu(3);
        System.out.println(sayininKupuSonuc);



        //1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
        int dikdortgenAlanSonuc = dikdortgenAlani(6, 5);
        System.out.println("Dikdortgenin alani = " + dikdortgenAlanSonuc);

        //2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        int dikdortgenCevreSonuc = dikdortgenCevresi(8, 12);
        System.out.println("Dikdortgenin cevresi = " + dikdortgenCevreSonuc);

        //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        double daireCevreSonuc = daireCevresi(9, 5);
        System.out.println("Dairenin cevresi = " + daireCevreSonuc);

        //4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz
        double daireAlanSonuc = daireAlani(5);
        System.out.println("Dairenin alani = " + daireAlanSonuc);


    }

    public static int add(int a, int b) {
        return a + b;
    } // Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu ile toplayan method'u olusturunuz ve kullaniniz

    protected static long multiply(int a, int b) {
        return a * b;

    }

    // Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu ile toplayan method'u olusturunuz ve kullaniniz
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {

        return a * b + c;
    }

    //ORNEK 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz
    // NOTE: Access Modifer'i default yapmak icin access modifier'i yazmayiniz
    static double sayininKupu(double a) {
        return a * a * a;
    }

    //1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    public static int dikdortgenAlani(int c, int d) {
        return c * d;
    }
    //2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz

    public static int dikdortgenCevresi(int e, int f) {
        return 2 * (e + f);
    }

    //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    public static double daireCevresi(double x, double r) {
        return 2 * 3.14 * r;
    }

    //4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    public static double daireAlani(double r) {
        return 3.14 * r * r;

    }

}