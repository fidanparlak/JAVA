package day07_Ternary_SwitchStstements;

public class C06_Ternary {
    public static void main(String[] args) {

        // Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        int not=26;

        System.out.println(not>=50 ? "Sinifi gectin" : " Maalesef kaldin");


        // Soru 3- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        char karakter='.';

        System.out.println(karakter>='a' && karakter<='z' ? (char)(karakter-32) : karakter);

        // Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        int input = 125;

        //   |5| => 5   |-4| => (-1)*(-4) =>4

        System.out.println(input>0 ? input : (-1)*input);







    }
}