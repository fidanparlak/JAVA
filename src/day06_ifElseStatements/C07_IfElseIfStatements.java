package day06_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30 veya daha buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak giriniz");
        double kilo= scan.nextDouble();

        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble();

        double vKI=(kilo*10000)/(boy*boy);
        System.out.println("Vücut kitle indexiniz : " + vKI);
        if(vKI>=30){
            System.out.println("Obez");
        } else if (vKI>=25) {
            System.out.println("Kilolu");
        } else if (vKI>=20) {
            System.out.println("zayif");
        }else {
            System.out.println("Cok zayif");
        }

    }
}
