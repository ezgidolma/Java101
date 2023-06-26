import java.util.Scanner;

public class TaksimetreHesaplama {
    public  static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int acilis=10;
        double basi=2.20;

        System.out.println("Mesafeyi Km cinsinden yazın:");
        int Km=input.nextInt();

        double total=acilis+Km*basi;

        if (total<20){
            System.out.println("Ödemeniz gereken ücret : "+20);
        }
        else {
            System.out.println("Ödemeniz gereken ücret : "+total);
        }

    }
}
