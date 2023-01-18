package day35_genelTekrar;

import java.util.Scanner;

public class C02_PrintfOndalikliSayi {
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

        double vke=(kilo*10000)/(boy*boy);

       // System.out.println("Vücut kitle indexiniz : " +vke);
        System.out.printf("Vücut kitle indexiniz : %.2f %n",vke);

        if(vke>=30){
            System.out.println("Obez");
        } else if (vke>=25) {
            System.out.println("Kilolu");
        } else if (vke>=20) {
            System.out.println("zayif");
        }else {
            System.out.println("Cok zayif");
        }



    }
}
