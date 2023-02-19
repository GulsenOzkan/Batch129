package day27encapsulationabstraction;

public abstract class Courses {
    /*
        1) Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
           Body'si olmayan method'lara " Abstract method" lar denir.
        2) "abstract metod" lar child'lar tarafindan "override" edilmek zorundadir.
           Bu yuzden, eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseniz
           o method'u abstract yapmak gerekir.
        3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
           "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.
        4) "abstract method" lar siradan class'larin (concrete) icine yazilamaz,
           "abstract method" larin icine yazildiklari class'lar abstract olmak zorundadirlar.
        5) "abstract class" larda hem "abstract method" lar hem de "concrete method" lar kullanilabilir.
        6) "concrete class" lar "abstract class" larin child'i olabilirler.
           "abstract method" larin override edilme zorunlugu " concrete class" lar icindir.
     */

    public abstract void math();

    public void art() {
        System.out.println("Painting...");
    }
    // final method'lar override edilemezler. Halbuki abstract method'lar override edilmek icin olusturulurlar.
    // Bu celiskidir bu yuzden Java abstract method'larin final olmasina musade etmez
    // public final abstract void science();

    // concrete class'lar final oldugunda child Class'a sahip olamaz.
    // Ama "Abstract Class" lar icin Child Class olmalidir.
    // Cunku Child Class'lar abstract parent class'daki abstract method'lari kullanirlar.
    // Bu yuzden, Java "abstract Class" larin "final" olmasina musade etmez.

    // "abstract method" lar "private" olamazlar, cunku Child Class"lar abstract method'lari kullanirlar,
    // private yapinca kullanima kapali olur.
    // Bu celiskidir, bu yuzden Java abstract method'larin "private" olmasina musade etmez.

    // abstract method'lar static olamazlar, cunku static method'lar override edilemezler
    // halbuki abstract method'lar override edilmek icin olusturulmustur.

}
