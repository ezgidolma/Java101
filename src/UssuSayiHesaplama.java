import java.util.Scanner;

public class UssuSayiHesaplama {

    static void ushesaplama(int alt,int us){
        int sonuc=1;
        if (us == 0) {
            System.out.println("Sonuç: " + 1);
        } else {
            for (int i = 1; i <= us; i++) {
                sonuc *= alt;
            }
            System.out.println("Üslü sayı sonucu :" + sonuc);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int us, alt;
        System.out.println("Altı giriniz: ");
        alt = input.nextInt();
        System.out.println("Üssü giriniz: ");
        us = input.nextInt();
        ushesaplama(alt,us);

    }
}
