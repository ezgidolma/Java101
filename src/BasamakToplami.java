import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi=input.nextInt();
        int basamak,toplam=0;

        while (sayi>0){
            basamak=sayi%10;
            sayi/=10;
            toplam+=basamak;

        }
        System.out.println("Sayının basamaklarının toplamı:"+toplam);

    }
}
