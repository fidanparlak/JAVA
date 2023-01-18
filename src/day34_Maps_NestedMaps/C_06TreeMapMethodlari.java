package day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C_06TreeMapMethodlari {
    public static void main(String[] args) {

        TreeMap<String,Integer> harfSayilariMap=new TreeMap<>();

        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap); //{A=10, C=15, D=3, K=5}

        System.out.println(harfSayilariMap.subMap("C", "F"));//{C=15, D=3} // cden basladi Fye kadar ne varsa yazdi
        System.out.println(harfSayilariMap.subMap("C", "K"));//{C=15, D=3} C dahil-K haric

        System.out.println(harfSayilariMap.subMap("B", "K"));//{C=15, D=3} alfabetik siraya gore yaziyo

        System.out.println(harfSayilariMap.descendingMap());//{K=5, D=3, C=15, A=10} tersten yazdirdi

        System.out.println(harfSayilariMap.lowerKey("E"));//D // bi onceki harfi yazdirir
        System.out.println(harfSayilariMap.lowerKey("D"));//C

        harfSayilariMap.floorKey("E");//D
        harfSayilariMap.floorKey("D");//D // kendisine esit olani, esit olan yoksa bi kucugunu verir

        System.out.println(harfSayilariMap.higherKey("D"));//K // kendinden buyuk olanii verir

        System.out.println(harfSayilariMap.ceilingKey("D")); // D-> Kendine esit veya esit degilse kendinden buyuk ama en kucuk sayiyi verir

        System.out.println(harfSayilariMap);//{A=10, C=15, D=3, K=5}

        System.out.println(harfSayilariMap.headMap("D"));//{A=10, C=15}
        System.out.println(harfSayilariMap.headMap("D",true));//{A=10, C=15, D=3}


        System.out.println(harfSayilariMap.tailMap("C"));// {C=15, D=3, K=5} Cden sonun kadar verir

        System.out.println(harfSayilariMap.tailMap("C",false));//{D=3, K=5}-> false dedigimiz icin Cyi dahil etmedi

        System.out.println(harfSayilariMap.pollFirstEntry());// ilk value keyini yazdirir A=10 u siler
        System.out.println(harfSayilariMap);//{C=15, D=3, K=5} yukarda Ayi sildi

        System.out.println(harfSayilariMap.pollLastEntry()); // son value keyini yazdirir ve siler K=5





    }
}
