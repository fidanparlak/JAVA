package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {

        // verilen bir Stringin Palidndrome olup olmadigini yazdirin
        // Palindrome : Düz okunusu ile tersten okunusu ayni olan

        String str = "ey edip adanada pide ye";

        String tersStr=C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("Verilen metin Palindrome");
        }else {
            System.out.println("Verilen metin Palindrome degil");
        }




    }
}
