import java.util.Arrays;
import java.util.Scanner;

public class DiziMaxMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] list={15,12,788,1,-1,-778,2,0};
        System.out.println("Sayı girin: ");
        int sayi=input.nextInt();
        int min=Integer.MAX_VALUE,max=Integer.MAX_VALUE;
        System.out.println("Girilen sayı: "+sayi);

        Arrays.sort(list);
        for (int i=list.length-1;i>=0;i--){
            if(list[i]<sayi){
                min=list[i];
                break;
            }
        }
        for (int i:list){
            if(i>sayi){
                max=i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı " + max);
    }
}
