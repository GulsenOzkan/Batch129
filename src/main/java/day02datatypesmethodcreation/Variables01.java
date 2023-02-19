package day02datatypesmethodcreation;

public class Variables01 {
    public static void main(String[] args) {

        // primitive data types --> char - boolean - byte - short - int - long - float - double
        // float: Virgullu sayilar (Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalarda - 12.99) --> 4 byte yer kaplar.
        // double: Virgullu sayilar (Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi - 0.0000000596) --> 8 byte yer kaplar.
        // NOTE: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar.

        // NOTE 1: Primitive data type'larini Java olusturmustur, biz olusturamayiz
        // NOTE 2: primitive data type'larin isimlerinde sadece kucuk harf kullanilir.
        // NOTE 3: primitive data'lar data type'lara gore memory de farkli farkli yer kaplar.
        // NOTE 4: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar

        //ORNEK 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz
        // Java "Decimal Numbers"i otomatik olarak double kabul eder.
        // Siz data type'ini "float" yazarsaniz hata verir.
        // float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        // System out println() ekrana yazdirir ve "pointer"i bir sonraki satira koyar.
        // System out print() ekrana yazdirir ve "pointer"i ayni satirda tutar.

        System.out.println(shirtPrice + shoesPrice);

        //ORNEK 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin
        double weightCell = 0.0000000000112;
        double weightAmip = 0.0000000000023;
        System.out.println(weightCell - weightAmip);

    }
}