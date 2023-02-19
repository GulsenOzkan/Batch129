package SmallStudyGroup03ocakSali.smallstudygroup15ocakpazar;

public class Ssg03_Varargs {
    public static void main(String[] args) {

        // Bir ogrencinin ismi, soyismi, sinifi ve yasi icin bir method olusturun.

        ogrencininbilgileri("Murat", "Biyik", "AA", 23);
        ogrencininBilgileriniYazdir(23, "Bilay", "Guney", "B");


    }

    public static void ogrencininBilgileriniYazdir(int yas, String... str) {
        for (String w : str) {
            System.out.println(w + " ");
        }
        System.out.println("Ogrencinin yasi : " + yas);
    }

    public static void ogrencininbilgileri(String ismi, String soyIsim, String sinif, int yas) {
        System.out.println(ismi + " " + soyIsim + " " + sinif + " " + yas);
    }

}
