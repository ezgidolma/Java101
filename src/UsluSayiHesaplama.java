import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int us, alt, sonuc = 1;
        System.out.println("Altı giriniz: ");
        alt = input.nextInt();
        System.out.println("Üssü giriniz: ");
        us = input.nextInt();
        if (us == 0) {
            System.out.println("Sonuç: " + 1);
        } else {
            for (int i = 1; i <= us; i++) {
                sonuc *= alt;
            }
            System.out.println("Üslü sayı sonucu :" + sonuc);
        }
    }
}
