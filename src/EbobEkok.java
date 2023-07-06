import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int num1,num2,ebob = Integer.MIN_VALUE,ekok=Integer.MAX_VALUE;

        Scanner input= new Scanner(System.in);
        System.out.println("Birinci sayıyı girin:");
        num1=input.nextInt();
        System.out.println("İkinci sayıyı girin:");
        num2=input.nextInt();

        for (int i=1;i<=num1;i++){
            if(num1%i==0 && num2%i==0){
               if(i>ebob){
                   ebob=i;
               }
            }
        }
        System.out.println("EBOB: "+ebob);


        System.out.println("EKOK: "+(num1*num2)/ebob);
    }
}
