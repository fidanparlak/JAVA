package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {
    public static void main(String[] args) {
        /*
        Asagidaki body'yi map olarak olusturun

        {   "firstname" : "Ahmet"//String
            "lastname" : “Bulut",//String
            "totalprice" : 500,//int
            "depositpaid" : false,//bolean
            "bookingdates" : {
                   "checkin" : "2021-06-01",//map
                   "checkout" : "2021-06-10"//map
                      },
            "additionalneeds" : "wi-fi" }
         */

        Map<String,String> bookingdatesMap=new HashMap<>();//14. satir

        bookingdatesMap.put("checkin" , "2021-06-01");
        bookingdatesMap.put("checkout" , "2021-06-10");

        Map<String,Object> bookingMap=new HashMap<>();

        bookingMap.put("firstname" , "Ahmet");
        bookingMap.put("lastname" , "Bulut");
        bookingMap.put("totalprice" , 500);
        bookingMap.put("depositpaid" , false);
        bookingMap.put("bookingdates", bookingdatesMap);
        bookingMap.put( "additionalneeds" , "wi-fi");

        System.out.println(bookingMap);

        /*
         {firstname=Ahmet,
         additionalneeds=wi-fi,
         bookingdates=
            {checkin=2021-06-01,
             checkout=2021-06-10},
         totalprice=500,
         depositpaid=false,
         lastname=Bulut}
         */

        //isim bilgisini yazdiralim

        System.out.println(bookingMap.get("firstname"));//Ahmet
        System.out.println(bookingMap.get("additionalneeds"));//wi-fi

        // booking mapindeki value data turu Object sectik
        // dolayisiyla bookingdates keyine ait value yu Object olarak bize getirir
        // ama biz onun map oldugunu biliyoruz
        //casting yapabiliriz
        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkin"));//2021-06-01

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkout"));//2021-06-10


    }
}
