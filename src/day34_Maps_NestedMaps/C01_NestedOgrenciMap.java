package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedOgrenciMap {
    public static void main(String[] args) {

        Map<Integer,Map<String,String>> ogrenciMap = new HashMap<>();


        Map<String,String> ogrenci101=new HashMap<>();
        ogrenci101.put("Isim","Ali");
        ogrenci101.put("SoyIsim","Can");
        ogrenci101.put("Sinif","11");
        ogrenci101.put("Sube","H");
        ogrenci101.put("Bolum","MF");


        Map<String,String> ogrenci102=new HashMap<>();

        ogrenci102.put("Isim","Veli");
        ogrenci102.put("SoyIsim","Cem");
        ogrenci102.put("Sinif","10");
        ogrenci102.put("Sube","K");
        ogrenci102.put("Bolum","TM");

        Map<String,String> ogrenci103=new HashMap<>();
        ogrenci103.put("Isim","Ali");
        ogrenci103.put("SoyIsim","Cem");
        ogrenci103.put("Sinif","11");
        ogrenci103.put("Sube","K");
        ogrenci103.put("Bolum","TM");

        ogrenciMap.put(101,ogrenci101);
        ogrenciMap.put(102,ogrenci102);
        ogrenciMap.put(103,ogrenci103);

        System.out.println(ogrenciMap);

        /*
          {101={SoyIsim=Can, Bolum=MF, Sube=H, Sinif=11, Isim=Ali},
           102={SoyIsim=Cem, Bolum=TM, Sube=K, Sinif=10, Isim=Veli},
           103={SoyIsim=Cem, Bolum=TM, Sube=K, Sinif=11, Isim=Ali}}
         */

        // 101 numarali ogrencinin ismini yazdiralim
        System.out.println(ogrenciMap.get(101).get("Isim"));

        // 102 numarali ogrencinin sinifini yazdiralim
        System.out.println(ogrenciMap.get(102).get("Sube"));

        System.out.println(ogrenciMap.get(103).get("Sinif"));

        // 103 numarali ogerncinin sinifini 12 yapalim

        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, Map<String, String>> eachOgrenciEntry : ogrenciEntrySeti) {

            //103={SoyIsim=Cem, Bolum=TM, Sube=K, Sinif=11, Isim=Ali}
            // once ogrenci valuesunu kaydetmeliyiz

          if (eachOgrenciEntry.getKey()==103){
              Map<String, String> eachOgrenciValueMap = eachOgrenciEntry.getValue();
              //{SoyIsim=Cem, Bolum=TM, Sube=K, Sinif=11, Isim=Ali}

              eachOgrenciValueMap.put("Sinif","12"); // update ettik

              eachOgrenciEntry.setValue(eachOgrenciValueMap);
          }

        }

        System.out.println(ogrenciMap);

    }

}
