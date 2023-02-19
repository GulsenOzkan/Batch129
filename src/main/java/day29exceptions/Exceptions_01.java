package day29exceptions;

public class Exceptions_01 {
    public static void main(String[] args) {

        Object obj = 70;
        String str ="";

        try {
            str = (String) obj;
        }catch(ClassCastException e) {
            System.out.println(str); // Birbirine donusturulemeyecek data type'larini donusturmekte israr ederseniz
                                     // Java ClassCastException atar

        }
    }
}
