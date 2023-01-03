package day24_stringbuilder;

public class EncapsuleClass{



    /*Jav CLASS ÜYELERINE ERISIMIN WRITE AND ReAD OLARARAK ayrilmasi istendiginde
    Encapsulation kullanilir.
    Bunun icin öncelikle bu class uyelerinin normal yollarla erisimi kapatilir.

    sonra istedigimiz yetkiyi verecek public method olustururuz
     */
    private  int satis; // satis bolumunden deger girilebilsin ama degeri gorunemesin ==>getter
    private  int toplamsatis=0;//gorunebilsin ama degistirilemesin ==>setter
    public  int halkaAcikSayi = 10; //herkese acik olsun ==>getter,setter

    public int getHalkaAcikSayi() {
        return halkaAcikSayi;
    }

    public void setHalkaAcikSayi(int halkaAcikSayi) {
        this.halkaAcikSayi = halkaAcikSayi;
    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamsatis+=this.satis;

    }

    public int getToplamsatis() {
        return toplamsatis;
    }






}
