import java.util.Scanner;

public class HipoCalculator {
    public  static void main(String args[]){
        Scanner input= new Scanner(System.in);

        System.out.println("a:");
        int a= input.nextInt();

        System.out.println("b:");
        int b= input.nextInt();

        System.out.println("c:");
        int c= input.nextInt();

        double u=(a+b+c)/2;

        double alan= Math.sqrt(u*(u-a)*(u-b)-(u-c));

        System.out.println("Alan :"+alan);
    }
}
