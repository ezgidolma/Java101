import java.util.Scanner;

public class ucedordebolunme {
    public static void main(String[] args) {
        int count=0,sum=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int number=input.nextInt();

        for (int i=0;i<=number;i++){
            if(number%3==0 && number%4==0){
                sum+=number;
                count++;
                if(count==0){
                    sum=0;
                }
            }

        }
        System.out.println("3'e ve 4'e bölünen sayıların ortalaması:"+sum/count);

    }
}
