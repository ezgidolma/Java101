import java.util.Scanner;

public class HesapMakinesi {
    public  static  void  main(String args[]){
        int n1,n2;
        int secim;

        Scanner input=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        n1=input.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        n2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz:");
        secim=input.nextInt();

        switch (secim){

            case 1:
                System.out.println("Toplama sonucu: "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma sonucu: "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma sonucu: "+(n1*n2));
                break;
            case 4:
                System.out.println("Bölme sonucu: "+(n1/n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
        }
    }
}
