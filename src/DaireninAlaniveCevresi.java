import java.util.Scanner;

public class DaireninAlaniveCevresi {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double pi=3.14;
         System.out.println("Dairenin çapı:");
         double r=input.nextDouble();

         System.out.println("Dairenin merkez açısının ölçüsü:");
         double a=input.nextDouble();

         double d_alan=(pi*(r*r)*a)/360;

         System.out.println("Daire diliminin alanı: "+d_alan);

    }
}
