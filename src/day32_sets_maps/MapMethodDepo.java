package day32_sets_maps;

import java.util.*;

public class MapMethodDepo {
    // bize ogrenciMap donduren bir method olusturun
    public static Map<Integer, String> ogrenciMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        return ogrenciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {
        // 1- tum value'leri bir collection olarak kaydedelim
        //    [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]
        Collection<String> valuesCollection = ogrenciMap.values();
        // 2- for-each kullanarak her bir value'yu ele alalim  Ali-Can-11-H-MF
        // 3- -'yi kullanarak split yapalim [Ali, Can, 11, H, MF]
        // 4- split yaptigimiz array'den isim bilgisini alalim 0.index
        // 5- eger value'den aldigimiz isim, aranan isim ile ayni ise
        //    true dondurup, for-each'i bitirelim
        // 6- for-each bittiginde true olmadiysa false dondurelim
        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valuedekiIsim = valueArr[0];
            if (valuedekiIsim.equalsIgnoreCase(isim)) {
                return true;
            }
        }
        return false;
    }

    public static void soyisimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {
        // 1- map'deki value'leri bir collection olarak kaydedelim
        //    [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]

        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        // listenin ilk satiri olarak basliklari yazdiralim

        System.out.println("Isim  Soyisim  Sinif Sube");

       // 2- for-each ile her bir value bilgisini ele alalim Ali-Can-11-H-MF
        // 3- value'yu "-" ile split yapip bir array elde edelim [Ali, Can, 11, H, MF]
        // 4- array'in 1.index'indeki soyisme bakip, aranan soyisim ile ayni ise
        //    isim, soyisim, sinif ve sube bilgilerini yazdiralim
        for (String eachValue : ogrenciValueCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valueSoyisim = valueArr[1];
            if (valueSoyisim.equalsIgnoreCase(soyisim)) {
                System.out.println(valueArr[0] + "  " +
                        valueArr[1] + "  " +
                        valueArr[2] + "  " +
                        valueArr[3]);
            }
        }
    }

    public static void subeListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {
        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("Isim   Soyisim");
        for (String eachValue : valueCollection
        ) {
            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]
            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(valueArr[0] + "  " + valueArr[1]);
            }
        }
    }

    public static Map<Integer, String> numaraIleSubeDegistirme(Map<Integer, String> ogrenciMap, int okulNo, String yeniSubeIsmi) {
        // 1- okul numarasini biliyoruz, direk ogrenci value'ye ulasabiliriz
        String ogrenciValue = ogrenciMap.get(okulNo); // Ayse-Can-10-H-MF
        String[] valueArr = ogrenciValue.split("-"); // [Ayse, Can, 10, H, MF]
        // 2- sube ismini guncelleyelim
        valueArr[3] = yeniSubeIsmi; //  [Ayse, Can, 10, M, MF]
        // 3- array'deki guncel bilgileri yeniden value formatinda bir String yapalim
        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" +
                valueArr[3] + "-" + valueArr[4];
        // 4- ogrenci no yani key ile yeni value'yu map'e ekleyelim
        ogrenciMap.put(okulNo, yeniValue);
        return ogrenciMap;
    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bolum) {

        // verilen bolumdeki ogrencilerin
        // No, isim soyisim ve siniflarini yazdiran
        // bir method olusturun

        System.out.println("No isim soyisim sinif");
        System.out.println("=================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry:entrySeti
             ) {
            String entryValue=eachEntry.getValue();
            String[] entryValueArr=entryValue.split("-"); //[Ali, Can, 11, H, MF]
            if (entryValueArr[4].equalsIgnoreCase(bolum));
            System.out.println(eachEntry.getKey()+" "+
                                entryValueArr[0]+" "+
                                entryValueArr[1]+" "+
                                entryValueArr[2] );
            
        }

    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        // Map’deki soyisimleri buyuk harfe ceviren bir method olusturun
        // bir entrySet yapalim

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        // 2- foreach ile herbir entry i elden gecirip soyisimleri buyuk harf yapalim

        for (Map.Entry<Integer,String>eachEntry:entrySeti) {
            // 3 -entryden value alalim

            String entryValue= eachEntry.getValue();
            //4- soyisim bilgisine ulasip degistirebilmek icin parcala

            String [] entryValueArr=entryValue.split("-");//[Ali, Can, 11, H, MF]
            //5- soyismi buyuk haf yapalim

            entryValueArr[1]=entryValueArr[1].toUpperCase();

            //6- degisikligi yaptiktan sonra yeniden degisiklikler yapip mapi update yapmaliyiz

            //7-

            eachEntry.setValue(entryValueArr[0]+"-"+
                               entryValueArr[1]+"-"+
                               entryValueArr[2]+"-"+
                               entryValueArr[3]+"-"+
                               entryValueArr[4]);


        }
            return ogrenciMap;

    }


    public static void tumListeYazdir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
        }
    }

    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {
        // ogrenci map'indeki tum sinif degerlerini 1 artirin
        // 12.sinifta olan varsa sinif bilgisini Mezun yapin

        //Mapte istedigimiz degisikligi yaptiktan sonra
        // mapi update etmenin en kolay yolu setEntry dir

        Set<Map.Entry<Integer,String>> entrySeti=ogrenciMap.entrySet();

        for (Map.Entry<Integer,String>eachEntry :entrySeti) { //101=Ali, Can, 11, H, MF//herbir entry ele alcaz

            String entrtyValue=eachEntry.getValue();//Ali, Can, 11, H, MF// entryden valueyu aldik

            String[] entryValueArr=entrtyValue.split("-");// [Ali, Can, 11, H, MF]//update yaptik

            int sinifInt= Integer.parseInt(entryValueArr[2]);

            if (sinifInt==12){

                entryValueArr[2]="Mazun";
            }else {
                entryValueArr[2]=sinifInt+1+"";
            }

            // sinif bilgisini guncelledik
            // bu guncellemeyi mape islememiz lazim

            eachEntry.setValue(entryValueArr[0] + "-"+
                               entryValueArr[1] + "-"+
                               entryValueArr[2] + "-"+
                               entryValueArr[3] + "-"+
                               entryValueArr[4]);

        }
            return  ogrenciMap;
    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogal sirali olarak
        // Yazdiran bir method olusturun
        
        //[Ali, Can, 11, H, MF] bunu parcalayip degistirmemiz lazim,listeye koyup siralayabiliriz
        //11 H Ali Can 101
       
        Set<Map.Entry<Integer,String>> entrySeti=ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti=new TreeSet<>();// Stringlerden istedigimiz bilgilere ulasabiliriz

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String entyValu=eachEntry.getValue(); // herbir enrty nin value degerini alalim Ali, Can, 11, H, MF

            String[] entyValuArr= entyValu.split("-");
            // [Ali, Can, 11, H, MF] istedigimiz gibi degistirmek icin arr ye cavirdik

            //Entry den istenen bilgileri alip yeni bir String olusturcaz
            // ve bu Stringleri sirali olarak yazdiracagiz

            String istenenFormattakiBilgi=entyValuArr[2]+" "+
                                          entyValuArr[3]+" "+
                                          entyValuArr[0]+" "+
                                          entyValuArr[1]+" "+
                                          eachEntry.getKey();// numarayi burdan aliyoruz
            siraliOgrenciSeti.add(istenenFormattakiBilgi); // istedigimiz formattaki bilgileri aldik treeMape yukluyoruz

        }
        System.out.println( "sinif sube isim soyisim no");
        System.out.println("===========================");
        for (String each : siraliOgrenciSeti) {
            System.out.println(each);



        }


    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {

        // tum ogrenci listesini isim soyisim no sinif sube bolum
        // seklinde sirali olarak yazdiran bir method olusturun

        Set<Map.Entry<Integer,String>> entrySeti=ogrenciMap.entrySet();
        Set<String> isimSoyisimSiraliSet=new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String value=eachEntry.getValue();

            String[] valueArr=value.split("-");  //[Ali, Can, 11, H, MF]

            String istenenFormattakiBilgi= valueArr[0]+" "+
                                           valueArr[1]+" "+
                                           eachEntry.getKey()+" "+ //numarayi burda aliyoruz
                                           valueArr[2]+" "+
                                           valueArr[3]+" "+
                                           valueArr[4];

            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);// istenen formattaki bilgiyi  isimSoyisimSiraliSet e ekliyoruz

        }
        // Sirali seti yazdiralim
        System.out.println("isim soyisim no sinif sube bolum");
        System.out.println("================================");
        for (String each : isimSoyisimSiraliSet) { // sirali olmasi icin for yaptik
            //System.out.println(each);//[Ali, Can, 11, H, MF]

            String[] duzenliYadirArr=each.split(" ");

            String isim=duzenliYadirArr[0];
            String soyisim=duzenliYadirArr[1];
            String no=duzenliYadirArr[2];
            String sinif=duzenliYadirArr[3];
            String sube=duzenliYadirArr[4];
            String bolum=duzenliYadirArr[5];
            System.out.printf("%-6.6s %-5.5s%-3s  %-2s   %-3s   %s%n",isim, soyisim , no , sinif , sube, bolum);
            // %6 dersek saga yaslar 6 krk lik yer kaplar
            // %-6 dersek saga yaslar
            // %6.6 dersek o siralamayi 6 karakterle sinirlar.uzun bir isim  girdigimizde
            // 6 dan fazlasini yazdirmaz
            
        }




    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {

        // verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir method olusturun
        System.out.println("No isim soyisism bolum");
        System.out.println("=============================");
        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        for (Map.Entry<Integer, String> eachEntry : entrySeti
        ) {//101, "Ali-Can-11-H-MF"

            //1-enry den value yu alalim

            String entryValue=eachEntry.getValue(); // 101, "Ali-Can-11-H-MF"

            // 2- bu valueyu parcalayalim ve bir arrye store edelim
            String[] valueArr=entryValue.split("-"); //[101, "Ali-Can-11-H-MF"]

            // sinif bilgisini kontrol edip
            // istenen sinif ile ayniysa istenen bilgileri yazdiralim
            if (valueArr[2].equalsIgnoreCase(sinif)){
                System.out.println(eachEntry.getKey()+" " +
                        valueArr[0]+" "+
                        valueArr[1]+" "+
                        valueArr[4]);

        }


    }


    }
}