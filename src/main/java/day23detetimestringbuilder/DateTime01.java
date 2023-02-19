package day23detetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
     // EXAMPLE 1: Time'i formatlayiniz

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        // hh ==> 12 lik saat sistemini kullanir. HH ==> 24 luk saat sistemini kullanir
        // hh kullandiginizda AM veya PM demelisiniz, bunu demek icin "a" yazmaniz yeterlidir. Yani ==> "hh:mm a"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm");
        System.out.println(dtf.format(myTime)); // 07-42




    }
}
