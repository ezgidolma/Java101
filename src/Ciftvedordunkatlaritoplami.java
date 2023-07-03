import java.util.Scanner;

public class Ciftvedordunkatlaritoplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam=0;
        int sayi ;


        do{
            System.out.println("Sayı giriniz:");
            sayi=input.nextInt();
            if(sayi%2==0 && sayi%4==0){
                toplam+=sayi;
            }
        }while (sayi%2==0);
        System.out.println("Toplam :" +toplam);
    }
}
