import java.util.Arrays;
import java.util.Scanner;

public class DiziKucuktenBuyuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu n:");
        int n= input.nextInt();
        int[] dizi= new  int[n];

        for (int i=0;i<n;i++){
            System.out.println("Dizinin elemanlarını giriniz :");
            dizi[i]= input.nextInt();
        }

        for (int i=0;i<n;i++){
            System.out.println((i+1)+". Elemanı: "+dizi[i]);
        }

        System.out.print("Sıralama: ");
            Arrays.sort(dizi);
            System.out.print(Arrays.toString(dizi));

    }
}
