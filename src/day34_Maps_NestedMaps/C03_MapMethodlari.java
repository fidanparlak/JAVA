package day34_Maps_NestedMaps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.containsValue("Ali"));//false
        // value degerinin tamami sorulursa true, bir parcasi sorulursa false doner

        System.out.println(ogrenciMap.getOrDefault(103, "Ogrenci bulunamadi"));
        //Ali-Cem-11-K-TM

        System.out.println(ogrenciMap.getOrDefault(113, "Ogrenci bulunamadi"));
        //Ogrenci bulunamadi

        System.out.println(ogrenciMap.get(123));//null

        ogrenciMap.replace(103, "Ali-Cem-11-K-MF");//varolani degistirdik

        System.out.println(ogrenciMap.get(103));//Ali-Cem-11-K-MF// yazdirdik

        ogrenciMap.put(103, "Ali-Cem-12-K-MF");// atama yaptik

        System.out.println(ogrenciMap.get(103));//Ali-Cem-12-K-MF // yazdirdik

        System.out.println(ogrenciMap.put(123, "Ali-Cem-12-K-MF"));// null

        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-12-K-MF,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 123=Ali-Cem-12-K-MF}
        ogrenciMap.replace(103, "Ali-Cem-12-K-MF", "Ali-Han-12-K-MF");// eski degeri yanlis verirsek degistirmez
        System.out.println(ogrenciMap.get(103)); // Ali-Han-12-K-MF

        ogrenciMap.replace(103, "Ali-Cem-12-K-MF", "Kemal-Han-12-K-MF");// eski degeri yanlis verirsek degistirmez
        System.out.println(ogrenciMap.get(103)); // Ali-Han-12-K-MF

        // kontrol eder, eski value verilen deger ile ayniysa degistirir,degilse degistirmez

    }


}
