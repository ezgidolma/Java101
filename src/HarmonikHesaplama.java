import java.util.Scanner;

public class HarmonikHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int sayi=input.nextInt();
        double harmonik=0;
        for (int i=1;i<=sayi;i++){
            harmonik+=1.0/i;
        }
        System.out.println("Sayının harmonik serisi: "+harmonik);
    }
}
