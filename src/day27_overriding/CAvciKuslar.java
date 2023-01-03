package day27_overriding;

public class CAvciKuslar extends BKuslar {
    protected void hareket( ){
    System.out.println("ucarlar");
}
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
    CAvciKuslar krt1  = new CAvciKuslar();

     krt1.hareket();//C den kullanir ucarlar
     krt1.beslenme();//c et yerler
     krt1.pence();//c pencelidir
     krt1.gaga();//c sivri gagali
     krt1.kanat();//b kanatlidirlar
     krt1.solunum();//b akcigerle nefes alirlar
     krt1.cogalma();//b yumurtayla cogalirlar
     krt1.omur();//a yasar ve olurler

        // eger constructor ile data türü ayni ise
        // özelligin variable veya method olmasina bakilmaksizin
        // o classa gidilir, o class veya parentt classlarda
        // bulunan ilk deger kullanilir

      BKuslar krt2 = new CAvciKuslar();

        krt2.hareket();//c den kullanir ucarlar
        krt2.beslenme();// et yerler
       // krt2.pence();//BKuslar veya Parent classda olmadigi icin CTE verir
        krt2.gaga();//c sivri gagali
        krt2.kanat();//b kanatlidirlar
        krt2.solunum();//b akcigerle nefes alirlar
        krt2.cogalma();//b yumurtayla cogalirlar
        krt2.omur();//a yasar ve olurler

        AHayvanlar krt3=new CAvciKuslar();

        krt3.hareket();//c den kullanir ucarlar
        krt3.beslenme();//c et yerler
       // krt3.pence();//AHayvanlar classda olmadigi icin CTE verir
       // krt3.gaga();//AHayvanlar classda olmadigi icin CTE verir
       // krt3.kanat();//AHayvanlar classda olmadigi icin CTE verir
        krt3.solunum();//b akcigerle nefes alirlar
        krt3.cogalma();//b yumurtayla cogalirlar
        krt3.omur();//a yasar ve olurler

    }
    }
