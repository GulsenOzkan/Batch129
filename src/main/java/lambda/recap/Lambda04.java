package lambda.recap;

import java.util.stream.IntStream;

public class Lambda04 {
    public static void main(String[] args) {

        System.out.println(birdenXeKadarToplam(10));
        System.out.println("\n  *********************************");


    }

    //SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.
    public static int birdenXeKadarToplam(int x) {
        int sonuc = IntStream.range(1, x + 1).sum();
        return sonuc;
    }

    //SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)
    public static void birdenXeKadarTekSayToplami() {

    }
}
