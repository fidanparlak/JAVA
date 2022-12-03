package day07_Ternary_SwitchStstements;

public class C11_SwitchCase {
    public static void main(String[] args) {
        //Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek
        // istedigini alin ve girilen harfin karsiligini yazdirin.
        // I : International
        // S : Software
        // T : Testing
        // Q : Qualifications
        // B: Board

        char harf = 'b' ;
        switch (harf) {
            case 'I':
            case 'i':
                System.out.println("international");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 't':
            case 'T':
                System.out.println("Testing");
                break;
            case 'q':
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'b':
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("hatalı giriş yaptınız.");
        }



    }
}
