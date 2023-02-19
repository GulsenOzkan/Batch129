package SmallStudyGroup03ocakSali.smallstudygroup15ocakpazar;

public class Ssg04_Varargs {
    public static void main(String[] args) {

        // Kac tane ill ismi verilirse verilsin
        // iclerinden en Uzun olani yazdiran bir method olusturun

        String ill1 = "Adana";//5
        String ill2 = "ankara";
        String ill3 = "Istanbul";
        String ill4 = "Bursa";
        String ill5 = "Van";

        enUzunIlIsmiYazdir(ill1, ill2, ill3, ill4, ill5);
        enUzunIlIsmiYazdir("van", "karadeniz", "kayseri", "nazilli", "fenerbahce");


    }

    public static void enUzunIlIsmiYazdir(String... str) {
        String enUzunIlismi = "";
        for (String w : str) {
            if (w.length() > enUzunIlismi.length()) {
                enUzunIlismi = w;
            }
        }
        System.out.println("En uzun il ismi = " + enUzunIlismi);
    }
}
