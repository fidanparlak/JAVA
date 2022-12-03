package day07_Ternary_SwitchStstements;

public class C10_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan gun numarasini alip
        // Hafta ici veya hafta sonu oldugunu yazdirin

        int gunNo = 7;

        switch (gunNo) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Hafta Ici");
                break;
            case 6:

            case 7:
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Gecersiz gun numarasi");
        }


    }
}