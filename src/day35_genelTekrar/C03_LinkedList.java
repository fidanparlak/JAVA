package day35_genelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {


    // Verilen bir LinkedList de
    // istenen iki index deki elementlerin yerlerini degistirin

    LinkedList<String> isimler=new LinkedList<>();
    isimler.add("said");
    isimler.add("Huseyin");
    isimler.add("Hasan");
    isimler.add("Sevilay");
    isimler.add("Humeyra");
        System.out.println(isimler); //[said, Huseyin,  Hasan, Sevilay , Humeyra]

        // Hasan ile Humeyranin yerini degistirelim
        // buyuk bir listede index bilmeden yapalim

        String ilkIsim="Hasan";
        String ikinciIsim="Humeyra";

        String temp="";

        temp=ilkIsim;
        int ilkIsimIndex=isimler.indexOf(ilkIsim);
        int ikinciIsimIndex=isimler.indexOf(ikinciIsim);

        isimler.set(ikinciIsimIndex,ikinciIsim);
        isimler.set(ikinciIsimIndex,temp);
        System.out.println(isimler); //[said, Huseyin, Sevilay, Hasan, Humeyra]








    }
 }