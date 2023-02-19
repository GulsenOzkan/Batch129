package smallstudygroup08ocakpazar1;

public class Ssg06_Arrays {
    public static void main(String[] args) {
 /*
      6.Soru -Verilen String bir array'de en uzun ve en kisa String'leri yazdıran bir method
      */
        String isimler[]={"sadik","abdurrahman","yasemin","omer"};



        enUzunVeEnKisa(isimler);


    }public static void enUzunVeEnKisa(String[] isimler){
        String enUzun=isimler[0]; String EnKisa=isimler[0];
        for (int i = 1; i < isimler.length ; i++) {
            if (isimler[i].length()>enUzun.length()){
                enUzun=isimler[i];
            }

            if (isimler[i].length()<EnKisa.length()){
                EnKisa=isimler[i];
            }
        }
        System.out.println("Array'deki en uzun kelime : " +enUzun);
        System.out.println("Array'deki en kısa kelime : "+EnKisa);

    }
}
