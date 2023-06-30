import java.util.Scanner;

public class BurcunuOgrenme {
    public static void main(String[] args) {
        int ay,gun;
        Scanner input=new Scanner(System.in);

        System.out.println("Burcunuzu öğrenmek için ayınızı girin: ");
        ay=input.nextInt();
        System.out.println("Burcunuzu öğrenmek için gününüzü girin: ");
        gun=input.nextInt();


        if((ay==1 && gun>=22) || (ay==2 && gun<20)){
            System.out.println("Siz Kova burcusunuz.");
        }
        else if((ay==2 && gun>=20) || (ay==3 && gun<=20)){
            System.out.println("Siz Balık burcusunuz.");
        }
        else if((ay==3 && gun>=21) || (ay==4 && gun<=20)){
            System.out.println("Siz Koç burcusunuz.");
        }
        else if((ay==4 && gun>=21) || (ay==5 && gun<=21)){
            System.out.println("Siz Boğa burcusunuz.");
        }
        else if((ay==5 && gun>=22) || (ay==6 && gun<=22)){
            System.out.println("Siz İkizler burcusunuz.");
        }
        else if((ay==6 && gun>=23) || (ay==7 && gun<=22)){
            System.out.println("Siz Yengeç burcusunuz.");
        }
        else if((ay==7 && gun>=23) || (ay==8 && gun<=22)){
            System.out.println("Siz Aslan burcusunuz.");
        }
        else if((ay==8 && gun>=23) || (ay==9 && gun<=22)){
            System.out.println("Siz Başak burcusunuz.");
        }
        else if((ay==9 && gun>=23) || (ay==10 && gun<=22)){
            System.out.println("Siz Terazi burcusunuz.");
        }
        else if((ay==10 && gun>=23) || (ay==11 && gun<=21)){
            System.out.println("Siz Akrep burcusunuz.");
        }
        else if((ay==11 && gun>=22) || (ay==12 && gun<=21)){
            System.out.println("Siz Yay burcusunuz.");
        }
        else if((ay==12 && gun>=22) || (ay==1 && gun<=19)){
            System.out.println("Siz Oğlak burcusunuz.");
        }

    }
}
