package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {


        /*
            1) +, -, *, / islemleri Java'da matematikte kullanildigi gibi kullanilir.
            NOTE 1: int / int ==> int olur.
            NOTE 2: double / int ==> double olur. Cunku Java'da matematiksel islemlerde
                    farkli data type'lari kullanilirsa sonuc buyuk data type'inda olur.

            2) Java'da "Logical operator" lar vardir.
               AND ve OR islemleri "logical operator" lardir.
                    - AND isleminde true alabilmek icin her sey true olmalidir.
                    - AND islemi "perfectionist" tir.
                    -  AND isleminde bir tane false sonucu false yapar.
               OR isleminde bir tane true sonucu true yapmaya yeter
                    - OR isleminde sonucun false olmasi icin hersey false olmalidir
                    - OR islemi "polyanna" gibidir.

               NOT ! Operatoru true olani false, false olani true yapar
                    !true = false
                    !false = true
                    !!true = true
             3) Comparaison (karsilastirma) Operators
                    <,>,<=, >=, ==, !=
                NOTE: Karsilastirma operatorlerini kullandiginizda kesinlikle boolean (true veya false) alirsiniz.

                NOTE: Biz AND islemi icin "&&" kullaniriz ama "&" kullanim da gecerlidir
                      Fark nedir?

                      "&&" kullanim ilk ifade false oldugunda digerlerini kontrol etmez. Hizli calisir
                      "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder. Yavas calisir.

         */

    public static void main(String[] args) {




        boolean first = 3<5;

        boolean second = 2+3 !=5;

        boolean third = 2+3*5>= 19;

        System.out.println(first + " - " + second + " - " + third); // true - false - false

        System.out.println(first && second); // false

        System.out.println(first || second || third); // true




    }
}
