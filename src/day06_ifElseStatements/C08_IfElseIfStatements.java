package day06_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen aldiginiz ürün adedini giriniz");
        int ürünAdedi= scan.nextInt();

        System.out.println("Lütfen aldiginiz ürünün fiyatini giriniz");
        double fiyat = scan.nextDouble();

        System.out.println("Müsteri kartiniz varmi? \nE:Evet , H:Hayir");
        char kart = scan.next().charAt(0);

        if(kart=='E' && ürünAdedi>10) {
            System.out.println("%20 indirimli toplam fiyat :" + ürünAdedi * fiyat * 0.8);
        } else if (kart=='E' && ürünAdedi<10) {
            System.out.println("%15 indirimli toplam fiyat :" + ürünAdedi * fiyat * 0.85);
            } else if (kart=='H' && ürünAdedi>10 ) {
            System.out.println("%15 indirimli toplam fiyat :" + ürünAdedi * fiyat * 0.85);
        } else if (kart=='H' && ürünAdedi<10) {
            System.out.println("%10 indirimli toplam fiyat :" + ürünAdedi * fiyat * 0.9);
        }else {
            System.out.println("Hatali giris");
        }

    }
        }





