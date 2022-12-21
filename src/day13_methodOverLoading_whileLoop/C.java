package day13_methodOverLoading_whileLoop;

import day12_methodCreation.C07_TerseCevirme;
import day12_methodCreation.C09_FibonacciSerisi;

public class C {
    public static void main(String[] args) {

        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);

    String str = "Bir kere yaparim yan gelir yatarim";
        String tersStr =C07_TerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr);

        str="java candir";
        tersStr = C07_TerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr);



    }
}
