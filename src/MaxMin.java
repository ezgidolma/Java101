import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class MaxMin {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n;
        int max=MIN_VALUE,min=MAX_VALUE;
        System.out.println("Kaç tane sayı gireceksiniz:");
        n=input.nextInt();
        int dizi[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.print((i+1)+". Sayıyı giriniz: ");
            dizi[i]=input.nextInt();

        }

        for (int i=0;i<n;i++){
          if(dizi[i]<min){
              min=dizi[i];
          }
        }
        for (int i=0;i<n;i++){
            if(dizi[i]>max){
                max=dizi[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

    }
}
