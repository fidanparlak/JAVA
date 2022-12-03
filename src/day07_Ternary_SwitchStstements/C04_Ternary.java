package day07_Ternary_SwitchStstements;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

            // Kullanicidan alinan deger
            // 100'den buyukse sayiyi 2 ile carpin
            // 100'e esit veya kucuk ise sayiya 10 ekleyin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        // if ile cozelim

        if(sayi>100) System.out.println(sayi*2);
        else if (sayi<=100) System.out.println(sayi+10);

        // ternary

        System.out.println(sayi>100 ?sayi*2 : sayi+10);



        //hocanin cözümü

        int input = 145;
        // if else ile yapalim
        if (input>100) {
            input*=2;
        } else {
            input+=10;
        }
        System.out.println("if else ile : "+input);
        input=145;
        input= input>100 ? input*2 : input+10 ;
        System.out.println("ternary ile : "+input);


         /*

          Verilen input'u inceleyin
          eger 100'den buyukse bunu 5'e bolup, bolum sonucunun tek sayi olup olmadigini kontrol edin
          eger 100'den buyuk degilse , 10 ile bolumunden kalani bulup, bu kalani 5 artirin
          Bu tur kompleks islemleri TERNARY ILE YAPMAYIZ

        */



    }
}
