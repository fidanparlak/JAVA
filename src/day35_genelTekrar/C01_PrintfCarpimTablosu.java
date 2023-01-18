package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_PrintfCarpimTablosu  {
    public static void main(String[] args) {

        // kullanicidan bir rakam alin ve carpim tablosu olusturun

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 0;

        while (girilenSayi < 2 || girilenSayi > 9) {// kabul edilmeyen oldugu icin || kullandik
            try {
                System.out.println("Carpim tablosu olusturmak icin rakam giriniz");
                girilenSayi = scan.nextInt();
                if (girilenSayi > 1 && girilenSayi < 10) { // kabul edilen  oldugu icin && kullandik
                    break; //
                }


                System.out.println("carpim tablosu icin 1'den buyuk pozitif bir rakam girmelisiniz");
            } catch (InputMismatchException e) { // kullanici tam sai girmeyince InputMismatchException aliriz
                System.out.println("carpim tablosu icin 1'den buyuk pozitif bir rakam girmelisiniz");
                scan.next();
            }

            }
            for (int i = 1; i <=girilenSayi ; i++) {

                for (int j = 1; j <=girilenSayi ; j++) {
                    int carpim=i*j;
                    System.out.printf("%5d  ",carpim);// carpim tablosunu guzel goruntu olmasi icin(-2) yaparsak sola dayali 2 bosluk birakir
                    // sayiyi artirdikca bosluk sayisi artar
                    
                }
                System.out.println(" ");
                



        }


    }


}
// /*
//        sayilarin arasinda 2 space var
//        sayilarda 2 karakter seklinde yazilip saga dayali yapildi
//        1   2   3   4   5
//        2   4   6   8  10
//        3   6   9  12  15
//        4   8  12  16  20
//        5  10  15  20  25

//        1 2 3 4 5
//        2 4 6 8 10
//        3 6 9 12 15
//        4 8 12 16 20
//        5 10 15 20 25
//         */