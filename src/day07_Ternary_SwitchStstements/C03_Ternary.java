package day07_Ternary_SwitchStstements;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

            // input olarak verilen sayiyi kontrol edip
            // sayi cift ise "cift sayi"
            // degilse "tek sayi" yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int input= scan.nextInt();

        System.out.println(input%2==0 ? "Cift sayi": "Tek sayi");

        // if ile yapalim

        if(input%2==0){
            System.out.println("Cift sayi");
        }else {
            System.out.println("Tek sayi");
        }










    }
}
