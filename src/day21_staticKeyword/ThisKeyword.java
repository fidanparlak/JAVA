package day21_staticKeyword;

public class ThisKeyword{




                ThisKeyword(int x){

                        this();

                        System.out.println("Parametreli constructor");

                }

                ThisKeyword(){

                        System.out.println("Parametresiz constructor");

                }

                public static void main(String[] args) {

                        ThisKeyword obj = new ThisKeyword(7);

                }
}
