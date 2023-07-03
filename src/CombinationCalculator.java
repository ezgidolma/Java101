import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,r,c,x;
        System.out.println("Kombinasyonu hesaplamak için n'yi giriniz:");
        n=input.nextInt();
        System.out.println("Kombinasyonu hesaplamak için r'yi giriniz:");
        r=input.nextInt();
        x=n-r;
        for (int i=n-1 ;i>=1;i--){
            n*=i;
        }
        for (int i=r-1 ;i>=1;i--){
            r*=i;
        }

        for (int i=x-1 ;i>=1;i--){
            x*=i;
        }
        c=n/(r*x);
        System.out.println("Kombinasyon C: "+c);
    }
}
